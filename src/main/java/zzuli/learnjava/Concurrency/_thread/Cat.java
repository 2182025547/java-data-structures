package zzuli.learnjava.Concurrency._thread;

/**
 * @Author songyitian
 * @date 2023/4/8
 * @time 11:01
 */
public class Cat extends Thread{
    static int num=0;
    @Override
    public void run() {
        while(true){
            System.out.println("小猫喵喵叫+"+(num++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(num==80){
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();

        System.out.println("执行主线程---");
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程执行中:"+i);
            Thread.sleep(1000);
        }
    }
}
