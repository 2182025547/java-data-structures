package zzuli.learnjava.io.byteStream_.zuoye;
import java.nio.file.Path;
import java.nio.file.LinkOption;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Author songyitian
 * @date 2023/3/12
 * @time 11:00
 */
public class hsp1 {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("/a.txt");
        System.out.println(path.toRealPath());
        if(!Files.exists(path)){
            Files.createFile(path);
        }
    }
}
