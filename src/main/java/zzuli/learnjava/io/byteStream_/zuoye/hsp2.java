package zzuli.learnjava.io.byteStream_.zuoye;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * @Author songyitian
 * @date 2023/3/12
 * @time 11:15
 */
public class hsp2 {
    public static void main(String[] args)  {
        Path path = Paths.get("/a.txt");
        File file = new File("/a.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

        try {
            FileReader fileReader = new FileReader("/a.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i=0;
            while(true){
                i++;
                String a=bufferedReader.readLine();
                if(a==null)break;
                System.out.println(i+a);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
