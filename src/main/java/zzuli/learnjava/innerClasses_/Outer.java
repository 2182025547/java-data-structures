package zzuli.learnjava.innerClasses_;

/**
 * @Author songyitian
 * @date 2023/4/3
 * @time 11:49
 */
public class Outer {
    class inter1{
        int y=1;
    }
    static class inter2{
        public  int y=1;
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.inter1 myinner= outer.new inter1();
        Outer.inter2 myinner2 = new inter2();
//        Outer.inter1 myinner3= new inter1();
        System.out.println(myinner2.y);
    }
}
