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

    /**
     *
     * @param a 待排序数组
     * @param p 数组下界
     * @param r 数组上界
     * @return 有序元素的索引
     * 首先选取一个基值，使基值在数组a[p,r]中有序，并且返回他的索引。为了获取基值的索引，需要从p到r遍历比较a[j]与基值，
     * 通过计数器 i（=p-1）定位基值的索引位置，同时为了满足基值在数组中的有序，(说明i:如果i!=j,则说明a[i+1]>x)
     * 所以如果当前循环中(a[j]<=x)成立，i++,交换a[i]与a[j],使得a[p..i]<基值
     */
    public static int partition(int a[],int p,int r){
        int x = a[r];
        int i = p-1;//i将会是数组下标的中值。即当函数执行完成后，下标小于i的元素值也小于a[i]，下标大于i的下标的元素大于元素a[i]
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
