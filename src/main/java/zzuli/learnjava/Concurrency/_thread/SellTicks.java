package zzuli.learnjava.Concurrency._thread;

import java.util.Random;

/**
 * @Author songyitian
 * @date 2023/4/8
 * @time 11:32
 */
public class SellTicks {


    public static void main(String[] args) throws InterruptedException {
//        Sell sell1 = new Sell("售票机1");
//        Sell sell2 = new Sell("售票机2");
//        Sell sell3 = new Sell("售票机3");
//        System.out.println("剩余票数："+100);
//        sell1.start();
//        sell2.start();
//        sell3.start();
//        Sell2 sell2 = new Sell2();
//        new Thread(sell2,"售票机1").start();
//        new Thread(sell2,"售票机2").start();
//        new Thread(sell2,"售票机3").start();
        Sell3 sell3 = new Sell3();
        new Thread(sell3,"售票机1").start();
        new Thread(sell3,"售票机2").start();
        new Thread(sell3,"售票机3").start();
        Thread.sleep(1000);
        int i=0;
        while(i++<10){
            sell3.hello();
            Thread.sleep(10);
        }

    }
}
class Sell extends Thread{
    public Sell(String name) {
        super(name);
    }

    private static int number=100;
    static boolean loop = true;
    @Override
    public void run() {
        while(loop)
            sellTickets();
    }
    //
    private  static synchronized void sellTickets(){
        if (number<=0){
            System.out.println("票卖完了！");
            loop = false;
            return;
        }

        if (number > 0) {
            try {
                number--;
                System.out.println(Thread.currentThread().getName()+"卖出了第"+(100-number)+"张票,剩余"+number+"张");
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.toString();
            }
        }
    }
}
class Sell2 implements Runnable{
    private int ticketNumbers=100;
    boolean loop = true;
    @Override
    public void run() {
        while(loop)
            sellTickets();
    }
    public synchronized void sellTickets(){
        if(ticketNumbers<=0){
            System.out.println("卖完了");
            loop = false;
            return;
        }
        if(ticketNumbers>0){
            try {
                ticketNumbers--;
                System.out.println(Thread.currentThread().getName()+"卖出了第"+(100-ticketNumbers)+"张票,剩余"+ticketNumbers+"张");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.toString();
            }
        }
    }
}
class Sell3 implements Runnable{
    private int ticketNumbers=100;
    @Override
    public void run() {
            synchronized (this) {
                while (ticketNumbers > 0) {
                    ticketNumbers--;
                    System.out.println("sold " + (100 - ticketNumbers) + " ticket,still have " + ticketNumbers + " tickets");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
    }
    public void hello(){
        System.out.println("hello");
    }
}






