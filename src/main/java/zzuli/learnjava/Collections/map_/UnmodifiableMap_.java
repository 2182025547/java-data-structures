package zzuli.learnjava.Collections.map_;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author C
 * @date 2023/4/22
 * {@code @time} 11:03
 */
public class UnmodifiableMap_ {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("song",14);

        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
        Set<Map.Entry<String, Integer>> entries = unmodifiableMap.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}
