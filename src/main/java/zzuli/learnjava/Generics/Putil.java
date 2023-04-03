package zzuli.learnjava.Generics;



public class Putil {
    public static <K,V> boolean compare(Pairs<K,V> p1,Pairs<K,V> p2){
        return p1.getV().equals(p2.getV());
    }
}
