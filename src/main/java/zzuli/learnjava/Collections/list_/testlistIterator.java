package zzuli.learnjava.Collections.list_;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author songyitian
 * @date 2023/4/5
 * @time 20:06
 */
public class testlistIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("0");
        for(int i=0;i<10;i++){
            sb.delete(0,1);
            sb.append(i);
            list.add(sb.toString());
        }
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
