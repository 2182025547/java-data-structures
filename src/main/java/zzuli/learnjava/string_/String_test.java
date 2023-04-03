package zzuli.learnjava.string_;

/**
 * @Author songyitian
 * @date 2023/3/30
 * @time 23:28
 */
public class String_test {
    public static void main(String[] args) {
        String s1 = new String("aaaaa");
        String s2 = new String("aaaaa");
        String ss1 = "aaaaa";
        String ss2 = "aaaaa";
        System.out.println(s1 == s2);
        System.out.println(s1 == ss1);
        System.out.println(ss1 == ss2);
    }
}
