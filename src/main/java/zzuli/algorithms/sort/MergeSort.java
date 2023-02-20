package zzuli.algorithms.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 时间复杂度：O(nlogn)
 * 空间复杂度: O(n)
 */
public class MergeSort {
    public static void merge(int a[],int p,int q,int r){
        //将子数组A[p...r]依据p创建出新的两个数组l[p,q],r[q+1,r]
        //Arrays.copyOfRange(int A[],int from,int to) 将数组A的索引为from到to-1的元素复制到新的数组中
        int[] L = Arrays.copyOfRange(a, p,q+1);
        int[] R = Arrays.copyOfRange(a,q+1,r+1);
        //重新构造数组a[p..r]
        int i=0,j=0;
        int k;
        for( k = p; k <= r && i < L.length && j < R.length;k++){
            if(L[i] < R[j])a[k] = L[i++];
            else a[k] = R[j++];
        }
        while (i < L.length) a[k++] = L[i++];
        while (j < R.length) a[k++] = R[j++];

    }
    public static void mergeSort(int a[],int p,int r){
        if(p<r){
            int q = (p+r)/2;
            mergeSort(a,p,q);
            mergeSort(a,q+1,r);
            merge(a,p,q,r);
        }

    }
}
