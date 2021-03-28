package com.xujie.Log4j;

import com.xujie.util.AESUtil;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.Node;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.AbstractStringLayout;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.nio.charset.Charset;

/**
 * log4j2 脱敏插件
 *
 * @Author qix*****
 * @Date 2020-08-20 15:57
 * @Version 1.0
 **/
@Plugin(name = "CustomPatternLayout", category = Node.CATEGORY, elementType = Layout.ELEMENT_TYPE, printObject = true)
public class CustomPatternLayout extends AbstractStringLayout {


    private PatternLayout patternLayout;


    protected CustomPatternLayout(Charset charset, String pattern) {
        super(charset);
        patternLayout = PatternLayout.newBuilder().withPattern(pattern).build();
    }


    public String hideMarkLog(String logStr) {
        try {
            String AES_KEY = "uKBqe+UYPTB09CE5GMFRjg==";
            return AESUtil.encrypt(AES_KEY,logStr,"UTF-8") + "\n";
        } catch (Exception e) {
            e.printStackTrace();
            return logStr;
        }
    }


    /**
     * LOG4J2-783 use platform default by default,
     * so do not specify defaultString for charset
     *
     * @param pattern
     * @param charset
     * @return
     */
    @PluginFactory
    public static Layout createLayout(@PluginAttribute(value = "pattern") final String pattern,
                                      @PluginAttribute(value = "charset") final Charset charset) {
        return new CustomPatternLayout(charset, pattern);
    }


    @Override
    public String toSerializable(LogEvent event) {
        return hideMarkLog(patternLayout.toSerializable(event));
    }

}

