package zzuli.algorithms.sort;

/**
 * 希尔排序
 * 平均复杂度：O(n^(3/2))
 * 稳定性：不稳定
 */
public class ShellSort {
    public static void shellSort(int a[]){
        int length = a.length;
        int gap = length/2;//分组步数
        for(; gap >= 1; gap/=2){
            //使用插入排序
            for(int i = gap; i < length; i+=gap ){
                int j;
                int key = a[i];
                for( j = i - gap; j >=0 && a[j] > key; j-=gap){
                    a[j+gap] = a[j];
                }
                a[j+gap] = key;
            }
        }
        for( int num : a){
            System.out.print(num+" ");
        }
    }
}
