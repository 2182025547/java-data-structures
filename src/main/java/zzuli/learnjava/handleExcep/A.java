package zzuli.learnjava.handleExcep;

/**
 * @Author songyitian
 * @date 2023/4/3
 * @time 21:36
 */
public class A {
    public static void main(String[] args) {
        int[] a={1,2,3};
        try{
            System.out.println(a[3]);
            System.out.println("hello");
        }catch (Exception e){
            System.out.println("捕获异常");
        }finally {
            System.out.println("一场出现了");
        }
        System.out.println("程序继续执行");
    }
}
