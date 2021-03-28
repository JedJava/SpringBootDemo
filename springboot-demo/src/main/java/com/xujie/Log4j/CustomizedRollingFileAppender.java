package com.xujie.Log4j;

import org.apache.log4j.RollingFileAppender;

/**
 * @description:
 * @author: JedX
 * @create: 2021-03-28 13:30
 */
public class CustomizedRollingFileAppender extends RollingFileAppender {



    /**
     * This method differentiates RollingFileAppender from its super class.
     *
     * @since 0.9.0
     */
    /*
    @Override
    protected void subAppend(LoggingEvent event) {
        this.qw.write(encrypt(this.layout.format(event)));
        if (layout.ignoresThrowable()) {
            String[] s = event.getThrowableStrRep();
            if (s != null) {
                int len = s.length;
                for (int i = 0; i < len; i++) {
                    this.qw.write(encrypt(s[i]));
                    this.qw.write(encrypt(Layout.LINE_SEP));
                }
            }
        }

        if (shouldFlush(event)) {
            this.qw.flush();
        }
        if (fileName != null && qw != null) {
            long size = ((CountingQuietWriter) qw).getCount();
            long nextRollover = 0;
            if (size >= maxFileSize && size >= nextRollover) {
                rollOver();
            }
        }
    }

    private String encrypt(String content) {

        try {
            String AES_KEY = "uKBqe+UYPTB09CE5GMFRjg==";
            return AESUtil.encrypt(AES_KEY,content,"UTF-8") + "\n";
        } catch (Exception e) {
            e.printStackTrace();
            return content;
        }
    }*/

}
