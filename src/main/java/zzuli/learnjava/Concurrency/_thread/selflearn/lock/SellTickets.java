package zzuli.learnjava.Concurrency._thread.selflearn.lock;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author songyitian
 * @date 2023/4/9
 * @time 16:26
 */
public class SellTickets {
    public static void main(String[] args) throws InterruptedException {
        sell sell = new sell();
        Thread system1 = new Thread(sell, "system1");
        Thread system2 = new Thread(sell, "system2");
        system1.start();
        system2.start();
    }
}

class sell implements Runnable {
    Lock lock = new ReentrantLock();

    private int ticketsNumber = 100;

    @Override
    public void run() {


        while (true) {
            try {
                lock.lock();
                if(ticketsNumber<=0)break;
                ticketsNumber--;
                System.out.println(Thread.currentThread().getName() + " has sold " + (100 - ticketsNumber));
            } finally {
                lock.unlock();
                //释放锁后休息100毫秒
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
