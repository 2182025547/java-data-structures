package zzuli.algorithms.sort;

public class CountingSort{
    /**
     *
     * @param a:输入数组
     * @param b:输出数组
     * @param k:数组中的最大值
     */
    public static void countingSort(int a[],int []b,int k){
        //声明一个临时数组c
        int[] c = new int[k+1];//创建 下标为0~k的临时苏族
        //统计a分布在数组c的位置
        for(int i=0;i<a.length;i++){
            c[a[i]]+=1;
        }
        //求一个矩形图
        for(int i=1;i<k+1;i++){
            c[i] = c[i] + c[i-1];
        }
        //通过矩形图将a填入输出数组b
        for(int j=a.length-1;j>=0;j--){
            b[c[a[j]]-1] = a[j];
            c[a[j]]-=1;
        }
    }
}