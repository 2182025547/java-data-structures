package zzuli.learnjava.Collections.list_;

import java.util.*;

public class List_ {
    public static void sort(List list){
        int size = list.size();
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-(i+1);j++){
                Book b1 = (Book)list.get(j);
                Book b2 = (Book)list.get(j+1);
                if(b1.getPrice()>b2.getPrice()){
                    list.set(j,b2);
                    list.set(j+1,b1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Book book = new Book("book1",14,"zhang san");
        Book book2 = new Book("book2",24,"zhang san");
        Book book3 = new Book("book3",4,"zhang san");
        Book book1 = new Book();
        System.out.println(book1);
        List list1 = new ArrayList();
        list1.add(book);
        list1.add(book2);
        list1.add(book3);
        sort(list1);
        list1.listIterator();
        System.out.println("list1:"+list1);
        System.out.println("_______________________");
        List vector = new Vector();
        vector.add(book);
        vector.add(book2);
        vector.add(book3);
        System.out.println("vector:"+vector);
        System.out.println("__________________________");
        List linkedList = new LinkedList();
        linkedList.add(book);
        linkedList.add(book2);
        linkedList.add(book3);
        System.out.println("LinkedList:"+linkedList);
        System.out.println("__________________________");
        //创建不可变的List
        List list = Collections.unmodifiableList(list1);
        list.add("attemp join");
    }
}
class Book{
    private String name;
    private int price;
    private String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
