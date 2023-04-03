package zzuli.learnjava.Concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Thread__ extends Thread {
    @Override
    public void run() {
        List<String> names = new ArrayList<>();
        names.add("songyitian");
        names.add("songyitian2");
        names.add("songyitian3");
        names.add("songyitian4");
        names.add("songyitian5");
        names.add("songyitian6");
        Iterator iterator = names.iterator();
        try{
            Thread.sleep(4000);
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }catch (Exception e){

        }
    }

    public static void main(String[] args) {
        new Thread__().start();
    }
}
