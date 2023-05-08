package zzuli.learnjava.Collections;

import java.util.*;

public class Collection_ {
    //Map
    //Collection
    public static void main(String[] args) {
//        List arrayList = new ArrayList();
//        arrayList.add("jack");
//        arrayList.add("Tom");
//        ///
//        Iterator iterator = arrayList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//
//        }
//        for (Object o : arrayList) {
//            System.out.println("o = " + o);
//        }
        Collection<String> c = new ArrayList<>();
        c.add("a");
        c.add("a");
        c.add("a");
        c.add("a");
        c.add("a");
        c.add("a");
        String[] sc = c.toArray(new String[0]);
        Collections.sort((List)c);
        Object[] sc2 = c.toArray();
        System.out.println(sc.length+""+c.size());
        System.out.println(c.contains("c"));
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }

}
