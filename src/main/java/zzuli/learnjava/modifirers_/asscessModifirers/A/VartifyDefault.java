package zzuli.learnjava.modifirers_.asscessModifirers.A;

/**
 * @Author songyitian
 * @date 2023/4/3
 * @time 10:00
 */
public class VartifyDefault {
    AwithDefault a;
    public static void main(String[] args) {
        AwithDefault a = new AwithDefault();
        a.getA();

        TestProtected t = new TestProtected();
        System.out.println(t.name+a.a);
        Default_ c = new Default_();
    }
    public void test(){
        a.getA();
    }
}

