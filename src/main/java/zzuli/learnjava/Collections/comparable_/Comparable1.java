package zzuli.learnjava.Collections.comparable_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author songyitian
 * @date 2023/4/17
 * @time 9:18
 */
public class Comparable1 {
    public static void main(String[] args) {
        students s1 = new students();
        students s2 = new students();
        students s3 = new students();
        students s4 = new students();
        s1.numId=1;
        s2.numId=1;
        s4.numId=2;
        s3.numId=3;
        List<students> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        for (students students : list) {
            System.out.println(students.numId);
        }
        Collections.sort(list);
        for (students students : list) {
            System.out.println(students.numId);
        }
    }
}
class students implements Comparable{
    int numId;

    /**
     * equals only when students.numId = o.numId
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        students s=null;
        if(o instanceof students) {
           s = (students) o;
        }
        else throw new ClassCastException();
        return this.numId-s.numId;
    }
}
