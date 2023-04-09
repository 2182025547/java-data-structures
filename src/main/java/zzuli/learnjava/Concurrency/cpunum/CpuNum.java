package zzuli.learnjava.Concurrency.cpunum;

/**
 * @Author songyitian
 * @date 2023/4/8
 * @time 10:34
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //输出当前电脑所拥有的cpu数量
        System.out.println(runtime.availableProcessors());
    }
}
