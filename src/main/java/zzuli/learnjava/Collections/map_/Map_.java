package zzuli.learnjava.Collections.map_;

import java.util.HashMap;
import java.util.Map;

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
        System.out.println(studentages.get("songyitian"));
    }
}
