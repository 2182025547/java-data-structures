package zzuli.learnjava.Concurrency._thread;



/**
 * @Author songyitian
 * @date 2023/4/8
 * @time 15:32
 */
public class Eatbaozi {
    public static void main(String[] args) throws InterruptedException {
        Boy boy = new Boy();
        Thread t1 = new Thread(boy);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("我吃le"+i+"ge1");
            Thread.sleep(1000);
            if(i==5){
                System.out.println("我歇会");
                t1.join();
                Thread.sleep(5000);

                System.out.println("我继续吃");
            }
        }
    }
}
class Boy implements Runnable {
    private boolean loop = true;
    @Override
    public void run() {
        int i=0;
        while(loop){
            System.out.println("大哥吃了"+(++i)+"个包子");
            if(i==10){
                System.out.println("大哥吃饱了");
                loop = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
