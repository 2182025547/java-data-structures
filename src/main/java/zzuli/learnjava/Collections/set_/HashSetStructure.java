package zzuli.learnjava.Collections.set_;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author songyitian
 * @date 2023/3/13
 * @time 19:42
 */
public class HashSetStructure {
    public static void main(String[] args) {
        hsArray hsArray = new hsArray();
        hsArray.data = new Node[16];
        hsArray.data[0] = new Node("songyitian",null);
        System.out.println(hsArray);
        //HashSet

    }
}
class hsArray{
    Object data[];

    @Override
    public String toString() {
        return "hsArray{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
class Node{
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
