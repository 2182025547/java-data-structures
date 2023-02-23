package zzuli.learnjava.Collections;

import java.util.*;

public class Collection_ {
    //Map
    //Collection
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("Tom");
        ///
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
        for (Object o : arrayList) {
            System.out.println("o = " + o);
        }


    }

}
