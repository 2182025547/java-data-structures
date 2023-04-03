package zzuli.learnjava.modifirers_.asscessModifirers.B;


import zzuli.learnjava.modifirers_.asscessModifirers.A.AwithDefault;
import zzuli.learnjava.modifirers_.asscessModifirers.A.TestProtected;


/**
 * @Author songyitian
 * @date 2023/4/3
 * @time 9:46
 */
public class AccessAd {
    AwithDefault a;
    public static void main(String[] args) {

        AwithDefault a = new AwithDefault();
        System.out.println(a);
        TestProtected t = new TestProtected();
//
    }
    public void test(){
        a.hashCode();
    }
}
