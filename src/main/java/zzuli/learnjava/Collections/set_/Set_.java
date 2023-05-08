package zzuli.learnjava.Collections.set_;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author songyitian
 * @date 2023/3/1
 * @time 20:33
 */
@SuppressWarnings({"all"})
public class Set_ {
    public static void main(String[] args) {
//        TreeSet
//        Set
//        HashSet hashSet = new HashSet();
        HashSet hashSet1 = new HashSet();
        Dog tom = new Dog("tom");
//        hashSet.add(tom);
        hashSet1.add(tom);
        hashSet1.add(new Dog("tom1"));
        hashSet1.add(new Dog("tom1"));
        hashSet1.add(1);

        for (Object o : hashSet1) {
            System.out.println(o);
        }
//        hashSet.add(2);
//        System.out.println("hashSet==hashSet1?"+hashSet.equals(hashSet1));
        System.out.println("new s1 == new s2?"+new String("111")==new String("111"));
    }
}
class Dog{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
