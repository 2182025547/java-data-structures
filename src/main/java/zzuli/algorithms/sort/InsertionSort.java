package zzuli.algorithms.sort;

/**
 * 插入排序---------------->可以联想为将桌面上的牌摸到手中，手中的牌是已经排好序的，桌面上是未排序的牌
 * 比较次数：最坏：O(n^2)，最好：O(n)
 * 稳定性： 稳定
 * 先将摸到的牌（key）抽出来放在一个变量中，在手中从右向左找这个key的位置，将比key小的牌往右移动，占据key流出的位置
 */
public class InsertionSort {
    public static void insertionSort(int a[]){
        int length = a.length;
        //第1张牌已经在左手中了(索引为0），开始摸第二张牌(索引为:1
        for(int j = 1; j < length; j++){
            int i;
            int key = a[j];//记录当前摸的牌
            //从右向左依次比较，直到找到牌的位置，insert a[j] into sorted squence a[0...j-1]
            for(i=j-1; i >= 0 && a[i] > key; i--){
                a[i+1] = a[i];//将比key大的牌后移
            }
            a[i+1] = key;//将牌i移动到正确的位置
        }
        for(int num : a){
            System.out.print(num + " ");
        }
    }
}
