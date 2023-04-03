package zzuli.learnjava.primitivedatatype;

/**
 * @Author songyitian
 * @date 2023/3/2
 * @time 10:02
 */
public class Initail__ {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int num : nums) {
            System.out.println("num = " + num);
        }
        System.out.println("++++===================++++");
        char[] cs = new char[5];
        for (char c : cs) {
            System.out.println("c = " + c);
        }
        System.out.println("print byte[]:");
        byte[] bs = new byte[5];
        for (byte b : bs) {
            System.out.println("b = " + b);
        }
        System.out.println("print long[]");
        long[] ls = new long[5];
        for (long l : ls) {
            System.out.println("l = " + l);
        }
        System.out.println("print double[]:");
        double[] ds = new double[5];
        for (double d : ds) {
            System.out.println("d = " + d);
        }
        System.out.println("print boolean[]:");
        boolean[] bos = new boolean[5];
        for (boolean bo : bos) {
            System.out.println("bo = " + bo);
        }
        String[] ss = new String[5];
        for (String s : ss) {
            System.out.println("s = " + s);
        }
    }
}
