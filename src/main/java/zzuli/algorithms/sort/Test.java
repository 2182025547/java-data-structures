package zzuli.algorithms.sort;

import static zzuli.algorithms.sort.BubbleSort.bulleSort;

public class Test {
    public static void main(String[] args) {
        int[] a={98,90,34,56,21};
        int[] b={5,2,4,6,1,3};
        int[] c={2,4,5,7,1,2,3,6};
        //bulleSort(a);
//        SelectionSort.selectionSort(a);
        InsertionSort.insertionSort(b);
//        ShellSort.shellSort(b);
//        MergeSort.mergeSort(c,0,c.length-1);
        System.out.println();
        for(int num:c){
            System.out.print(num+" ");
        }

    }
}
