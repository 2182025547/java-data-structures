package zzuli.learnjava.Collections.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author songyitian
 * @date 2023/3/1
 * @time 20:14
 */
public class Map_ {
//    Map
    public static void main(String[] args) {
        Map<String,Integer> studentages=new HashMap<>();
        studentages.put("songyitian",18);
        studentages.put("s2",18);
        studentages.put("s3",18);
        studentages.put("s4",18);
        studentages.put("s5",18);
        System.out.println("遍历方式1：遍历entry");
        //遍历方式1：遍历entry
        Iterator<Map.Entry<String,Integer>> iterator = studentages.entrySet().iterator();
        while (iterator.hasNext()) {

            Map.Entry<String,Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key:"+key+"value:"+value);
        }
        System.out.println("遍历方式2遍历key");
        //遍历方式2遍历key
        Set<String> keyset = studentages.keySet();
        for(String key:keyset){
            System.out.println(key+studentages.get(key));
        }
        //遍历方式3，使用java8的Stream
        System.out.println("遍历方式3，使用java8的Stream");

        studentages.forEach((key,value)-> {
            System.out.println(key + value);
        });
    }
}
