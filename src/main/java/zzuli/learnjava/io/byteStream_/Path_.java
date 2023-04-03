package zzuli.learnjava.io.byteStream_;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * @Author songyitian
 * @date 2023/3/11
 * @time 21:35
 */
public class Path_ {
    public static void main(String[] args) {
        Path path = Paths.get("/xanadu.txt");
        System.out.println(path.getFileSystem()+""+path.getFileName()+path.getRoot()+path.getNameCount());
    }
}
