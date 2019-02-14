package java8.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 *在Java 8中，Base64编码已经成为Java类库的标准。
 *
 * Java 8 内置了 Base64 编码的编码器和解码器。
 *
 * Base64工具类提供了一套静态方法获取下面三种BASE64编解码器：
 *
 * 基本：输出被映射到一组字符A-Za-z0-9+/，编码不添加任何行标，输出的解码仅支持A-Za-z0-9+/。
 * URL：输出映射到一组字符A-Za-z0-9+_，输出是URL和文件。
 * MIME：输出隐射到MIME友好格式。输出每行不超过76字符，并且使用'\r'并跟随'\n'作为分割。编码输出最后没有行分割。
 */
public class Main {

    public static void main(String[] args) {
        try {
            //编码
            String s = Base64.getEncoder().encodeToString("base64-java8".getBytes("utf-8"));
            System.out.println(s);

            //解码
            byte[] decode = Base64.getDecoder().decode(s);
            System.out.println(new String(decode, "utf-8"));

            //url编码
            String s1 = Base64.getUrlEncoder().encodeToString("base64?java8".getBytes("utf-8"));
            System.out.println(s1);

            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < 10; i++){
                stringBuffer.append(UUID.randomUUID().toString());
            }

            byte[] bytes = stringBuffer.toString().getBytes("utf-8");
            String s2 = Base64.getMimeEncoder().encodeToString(bytes);
            System.out.println(s2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
