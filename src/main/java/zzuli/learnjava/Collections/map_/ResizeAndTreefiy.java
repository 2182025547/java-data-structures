package zzuli.learnjava.Collections.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author songyitian
 * @date 2023/4/20
 * @time 20:48
 */
public class ResizeAndTreefiy {
    public static void main(String[] args) {
        Map<C,Integer> map = new HashMap<>();
        ResizeAndTreefiy resizeAndTreefiy = new ResizeAndTreefiy();

        for(int i=0;i<12;i++){
            map.put(new C(i),i);
        }

    }
}
class C{
    int num;

    @Override
    public int hashCode() {
        return 90;
    }


    public C(int num) {
        this.num = num;
    }
}

