package zzuli.learnjava.string_;

/**
 * @Author songyitian
 * @date 2023/3/13
 * @time 23:53
 */
public class StringLab {
    public static void main(String[] args) {
        String a1 = "a1";
        String b1 = "a1";
        String c = new String("a1");
        System.out.println(a1.equals(b1));
        System.out.println(a1.equals(c));
        char a = '3';
        String s="2,147,483,647";
        char[] ans = s.toCharArray();
        String da="";
        int i = 0;
        while(i<ans.length) {
            if (ans[i] >= '1' && ans[i] <= '9') {
                da += ans[i];
            }
            i++;
        }
        Integer n = new Integer(da);
        if(n>Long.MAX_VALUE){
            System.out.println("wrong");
        }
        System.out.println(n);
        StringBuilder sb = new StringBuilder();
        sb.append(s.toCharArray()[0]);
    }
}
