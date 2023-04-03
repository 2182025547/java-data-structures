package zzuli.learnjava.Concurrency;

public class Runable_ implements Runnable{
//    Thread
    @Override
    public void run() {
        System.out.println("Hello,Thread!");
    }

    public static void main(String[] args) {
        (new Thread(new Runable_())).start();
    }
}
