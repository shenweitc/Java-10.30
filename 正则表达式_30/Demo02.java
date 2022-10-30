package 正则表达式_30;

public class Demo02 {
    public static void main(String[] args) {
        String s="小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String s1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(s1);
        System.out.println("===========");
        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
