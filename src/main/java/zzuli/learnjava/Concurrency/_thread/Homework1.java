package zzuli.learnjava.Concurrency._thread;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author songyitian
 * @date 2023/4/9
 * @time 11:19
 */
public class Homework1 {
    public static void main(String[] args) {
        /**
         * my solution
         */
//        Thread1 thread1 = new Thread1();
//        Thread a = new Thread(thread1,"A");
//        Thread b = new Thread(thread1,"B");
//        a.start();
//        b.start();
        /**
         * hsp solution
         */
        home1 h1 = new home1();
        home1_2 h12 = new home1_2(h1);
        h12.setDaemon(true);
        h1.start();
        h12.start();
    }
}

/**
 * 我的实现方式
 */
class Thread1 implements Runnable{
    int number;
    boolean loop = false;

    public Thread1() {

    }

    @Override
    public void run() {
        number++;
        if(number==1) {
                while (!loop) {
                    System.out.println(Thread.currentThread().getName() + (new Random()).nextInt(100));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

        }
        else {
            Scanner scanner = new Scanner(System.in);
            while(true){
                String s = scanner.nextLine();
                if(s.equals("c")||s.equals("C")){
                    loop = true;
                    break;
                }
            }

        }
    }
}
/**
 * hsp实现方式
 *
 */
class home1 extends Thread{
    boolean loop = true;
    @Override
    public void run() {
        while(loop){
            System.out.println(new Random().nextInt(100)+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
        }
    }
}

class home1_2 extends Thread{
    home1 a;
    public home1_2(home1 a){
        this.a =a;
    }
    @Override
    public void run() {
        while(true){
            System.out.println("输入Q退出线程A:");
            Scanner scanner = new Scanner(System.in);
            String c = scanner.next();
            if(c.length()>1){
                System.out.println("please write again");
            }
            if(c.equals("Q")){
                a.loop = false;
                System.out.println("notify A to exist");
            }
        }
    }
}