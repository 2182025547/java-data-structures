package zzuli.learnjava.Generics;

import zzuli.algorithms.sort.InsertionSort;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
//
public class Box<C> {
    private C c;

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
    public <C extends Integer> void get555(C c){
        System.out.println("555");
    }
}
