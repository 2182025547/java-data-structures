package zzuli.algorithms.sort;

public class QuickSort {

    /*
    ** p：数组的左边界
    ** r：数组的右边界
    */
    public static void quickSort(int a[],int p,int r) {
        if(p<r){
            int q = partition(a, p, r);
            quickSort(a, p, q-1);
            quickSort(a, q+1, r);
        }
    }
    //实现A[p~r]的原址排序
    public static int partition(int a[],int p,int r){
        int x = a[r];
        int i = p-1;//i将会是数组下标的中值。即当函数执行完成后，下标小于i的元素值也小于i，下标大于i的下标的元素大于元素i
        int tmp;
        for(int j=p;j<r;j++){
            if(a[j]<=x){
                i++;
                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        //将x即中值放到i+1的位置
        tmp = a[i+1];
        a[i+1] = a[r];
        a[r] = tmp;
        return i+1;
    }
}
