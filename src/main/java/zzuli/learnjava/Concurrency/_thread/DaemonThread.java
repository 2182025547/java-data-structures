package zzuli.learnjava.Concurrency._thread;

/**
 * @Author songyitian
 * @date 2023/4/8
 * @time 15:57
 */
public class DaemonThread extends Thread{
    public static void main(String[] args) throws InterruptedException {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();

        for(int i=0;i<100;i++){
            System.out.println(i);
            if(i==1){
                thread.interrupt();
            }
            Thread.sleep(100);

        }
    }

    @Override
    public void run() {
        int i=0;
        while(true){
            System.out.println("hello"+(++i));
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println("被打断了");
            }
        }
    }
}
