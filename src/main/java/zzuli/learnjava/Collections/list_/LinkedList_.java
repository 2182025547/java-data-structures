package zzuli.learnjava.Collections.list_;

import java.util.LinkedList;

/**
 * @Author songyitian
 * @date 2023/3/1
 * @time 16:30
 * 模拟一个简单的双向链表
 */
public class LinkedList_<E> {

    Node first;
    Node last;
    int size;

    public void add(Node<E> e){
        if(last==null&&first==null){

            first = e;
            last = e;
        }
        else {
            last.next = e;
            e.next = null;
            e.pre = last;
            last = last.next;
        }

    }
    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //LinkedList
    public static void main(String[] args) {
        LinkedList_ linkedList_ = new LinkedList_();
        Node<String> xlaopo=new Node<String>("xiaolaopo:guorongrong");
        Node<String> dlaopo = new Node<String>("dalaopo:caoxinke");
        linkedList_.add(xlaopo);
        linkedList_.add(dlaopo);
        Node<String> node = linkedList_.first;
        while(true){
            if(node!=null){
                System.out.println(node);
                node = node.next;
            }
            else break;
        }
    }
}

//node类定义一个链表的节点
class Node<E>{
    E data;
    Node<E> next;
    Node<E> pre;

    public Node(E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
