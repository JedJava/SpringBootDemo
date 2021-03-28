import com.xujie.util.AESUtil;
import lombok.extern.log4j.Log4j;
import org.junit.Test;

/**
 * @description:
 * @author: JedX
 * @create: 2021-03-23 21:11
 */
@Log4j
public class test {
/*    @Test
    public void test(){


        List<String> list = new ArrayList<>();

        for (int i = 1; i < 501; i++) {
            list.add("责任险"+ i );
        }
        for (int i = 501; i <= 1008; i++) {
            list.add("责"+i+"任"+i+"险");
        }

        List<String> searchedList = new ArrayList<>();
        for (String search : list) {
            if (search.contains("责")){
                searchedList.add(search);
            }
        }
        System.out.println(searchedList.size());

        List<String> resultList = searchList(searchedList, "101", "10");
        for (String result : resultList) {
            System.out.println(result);
        }
    }

    @Test
    public List<String> searchList(List<String> list , String pageNum , String pageSize){

        //对list判空
        if (list.isEmpty()){
            return null;
        }
        int pageNumber = Integer.parseInt(pageNum);
        int pageCount = Integer.parseInt(pageSize);
        int fromIndex = (pageNumber -1) * pageCount;
        int toIndex = pageNumber * pageCount;
        //如果toIndex不为正，返回null
        if (toIndex <= 0){
            return null;
        }
        //如果fromIndex大于集合长度，返回null
        if (fromIndex > list.size()){
            return null;
        }
        //如果toIndex大于集合长度，替换为集合最大索引
        if (toIndex > list.size()){
            toIndex = list.size();
        }

        return list.subList(fromIndex,toIndex);

    }*/

    @Test
    public void testLog4j(){
        log.info("info打印：：：");
    }

    @Test
    public void testAESEncrypt() throws Exception {
        String AESKey = "uKBqe+UYPTB09CE5GMFRjg==";
        String encryptData = "430681199607156434";
        String encode = "UTF-8";

        String encrypt = AESUtil.encrypt(AESKey, encryptData, encode);
        System.out.println(encrypt);

        String decrypt = AESUtil.decrypt(AESKey, "ZH7TUYTM662220u0L7+lNJdYAU0vdkRFG/JZ5PuqCqTv2y6gJWCfQfmBsHsZ9dEObMlj/0VhmH2yn/mSno3JQA==", encode);
        System.out.println(decrypt);
    }
}
