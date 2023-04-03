package zzuli.learnjava.io.byteStream_;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author songyitian
 * @date 2023/3/11
 * @time 15:14
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("D:\\CodeLab\\java-data-structures\\src\\main\\java\\zzuli\\learnjava\\io\\byteStream_\\xanadu.txt");
            out = new FileOutputStream("D:\\CodeLab\\java-data-structures\\src\\main\\java\\zzuli\\learnjava\\io\\byteStream_\\outagain.txt");
            int c;

            while( (c=in.read())!=-1){
                System.out.print((char) c);
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
