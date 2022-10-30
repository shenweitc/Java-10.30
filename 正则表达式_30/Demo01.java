package 正则表达式_30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo01 {
    public static void main(String[] args) {
        String s = "Java自从95年问世以来，abbbbbbbbbaaaaaaaaaaaaa" +
        "经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，" +
        "下一个长期支持版本是Java17, 相信在未来不久Java17也会逐渐登上历史舞台";

        Pattern p = Pattern.compile("ab+");
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
        System.out.println("==========");
        Pattern p1 = Pattern.compile("ab+?");
        Matcher m1 = p1.matcher(s);
        while (m1.find()){
            System.out.print(m1.group()+" ");
        }

    }
}
