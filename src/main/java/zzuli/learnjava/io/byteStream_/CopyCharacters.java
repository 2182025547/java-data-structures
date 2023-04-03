package zzuli.learnjava.io.byteStream_;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author songyitian
 * @date 2023/3/11
 * @time 17:18
 */
public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        try{
            reader = new FileReader("D:\\CodeLab\\java-data-structures\\src\\main\\java\\zzuli\\learnjava\\io\\byteStream_\\xanadu.txt");
            writer = new FileWriter("D:\\CodeLab\\java-data-structures\\src\\main\\java\\zzuli\\learnjava\\io\\byteStream_\\outagain.txt");

            int b;
            while((b=reader.read())!=-1){
                System.out.print((char) b);
                writer.write(b);
            }
        }finally {
            if(reader!=null){
                reader.close();
            }
            if(writer!=null){
                writer.close();
            }
        }
    }
}
