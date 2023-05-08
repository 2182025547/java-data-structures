package zzuli.learnjava.Stream_.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * @Author Crean Culty
 * @date 2023/4/22
 * @time 11:26
 * description:
 */
public class Instance__ {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("宋一天");
        list.add("张无忌");
        list.add("张三");
        list.add("李四");
        //把张姓元素添加到新的集合中
        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));
        ArrayList list1 = new ArrayList();
    }
}
