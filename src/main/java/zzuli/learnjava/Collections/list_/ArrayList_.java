package zzuli.learnjava.Collections.list_;

import java.util.*;

public class ArrayList_ {
    public static void main(String[] args) {
//        List  list = new ArrayList();
////        for(int i=1;i<=10;i++){
////            list.add(i);
////        }
////        for(int i=11;i<=15;i++){
////            list.add(i);
////        }
////        list.add("null");
////        list.add(200);
        List l2 = new ArrayList(1);
//        Collection
//        l2.add(0);
//        for(int i=1;i<=10;i++){
//            l2.add(i);
//        }
        l2.add(1);
        l2.add("null");
        l2.add(0,0);
        Iterator iterator = l2.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
