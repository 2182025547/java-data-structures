package zzuli.learnjava.Concurrency._thread;

/**
 * @Author songyitian
 * @date 2023/4/8
 * @time 16:30
 */
public class ThreadStateTEst {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        System.out.println(a.getState());
        a.start();
        System.out.println(a.getState());
        a.join();
        System.out.println(a.getState());
        Thread.sleep(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(a.getState());
        }
        a.loop = false;
        Thread.sleep(1000);
        System.out.println(a.getState());
    }
}
class A extends Thread{
    boolean loop = true;
    @Override
    public void run() {
        while(loop){
            System.out.println("hello!");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
