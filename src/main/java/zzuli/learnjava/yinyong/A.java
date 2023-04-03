package zzuli.learnjava.yinyong;

/**
 * @Author songyitian
 * @date 2023/3/27
 * @time 21:33
 */
public class A {
    String name;

    public A(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        A a = null;
        A b = a;
        a = new A("yitian");
        System.out.println(b.name);

    }
}
