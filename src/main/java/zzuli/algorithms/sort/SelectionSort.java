package zzuli.algorithms.sort;

/**
 * 选择排序：每次选择未排序的最小的元素，与当前索引位置元素狡猾
 * 假设需要的排列顺序是非递减的
 * ***********************************************************
 * 比较次数：1/2*n^2-1/2*n
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
public class SelectionSort {
    public static void selectionSort(int a[]){
        int minIndex,temp,length = a.length;
        //从第一个元素开始便利后面的元素，找出其后面比它更小的且最小的元素，交换两个数，直到倒数第二个数：即 < length-1
        for( int i = 0; i < length-1; i++){
            System.out.println("第"+(i+1)+"轮展开");
            minIndex = i;
            //找到比a[i]小的且是最小的元素，
            for(int j = i + 1; j < length; j++){
                if(a[minIndex] > a[j]) minIndex = j;
            }
            //交换a[i],a[minIndex]
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        for(int num : a){
            System.out.print(num + " ");
        }
    }

}
