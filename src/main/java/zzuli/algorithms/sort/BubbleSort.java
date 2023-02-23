package zzuli.algorithms.sort;

import java.sql.SQLOutput;

/**
 * 冒泡排序算法 ，基于交换的算法，每一轮都会确定最后一个元素
 * 假设从小到大，步骤：
 * 1.从头开始，比较相邻的两个数，如果第一个数比第二个数大，就交换这两个数的位置
 * 2.从开始到最后一对比较完成，一轮结束后，最后一个元素的位置已经确定
 * 3.除最后一个元素外的前面的所有元素仍未有序
 * 4.重复1~3，直到所有元素都有序
 */
public class BubbleSort {
    public static void bulleSort(int[] a){
        int temp,length=a.length;
        //要进行length-1轮循环,从（i+1)轮开始
        for(int i=0;i<length-1;i++){
            System.out.println("第"+ (i+1) +"轮交换");
            //每轮循环执行次数为 length-(i+1)
            for( int j = 0; j < length - ( i + 1 ); j++){
                //对比相邻的两个元素
                if( a[j] >  a[j+1] ){
                    //元素交换，使得大元素在后面
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int num : a){
            System.out.print(num+" ");
        }
    }


//bubbleSort 假设数组长度为n，第一轮比较n-1次，第二轮比较n-2次..
// 比较次数：n+n-1 + n-2 + n-3 + ... + 1
    //时间复杂度: O(n^2)
    //空间复杂度: O(1)
    //稳定的排序算法
}
