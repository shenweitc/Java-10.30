package 正则表达式_30;

public class Demo03 {
    public static void main(String[] args) {
        //a123a
        String regex1="(.).+\\1";
        System.out.println("a123a".matches(regex1));
        //abc123abc
        String regex2="(.+).+\\1";
        System.out.println("abc123abd".matches(regex2));
        //aaa123aaa
        String regex3="((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        //String str ="我要学学编编编编程程程程程程";
        String str="我要学学编编编编程程程程程程";
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);

    }
}
