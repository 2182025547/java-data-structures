package zzuli.learnjava.Lambada_.qucikstart;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author songyitian
 * @date 2023/4/21
 * @time 21:11
 * 体验正则表达式的威力，给我们文本处理带来哪些便利
 */
public class FirstStep {
    public static void main(String[] args) {
        //假定，编写了爬虫，从百度页面得到了文本
//        FileReader fileInput = null;
//        try {
//            fileInput = new FileReader("src/main/java/zzuli/learnjava/Lambada_/qucikstart/message.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        BufferedReader input = new BufferedReader(fileInput);
//        StringBuilder sb = new StringBuilder();
//        try {
//            String line=null;
//            while ( (line = input.readLine()) != null) {
//                sb.append(line + "\n");
//            }
//        }catch (IOException e){
//
//        }
//        sb.append(input.lines());
//        String passage = sb.toString();
//        //1.先创建一个Pattern对象
//        Pattern pattern = Pattern.compile("[a-zA-z]+");
//        //2创建一个匹配器对象
//        Matcher matcher = pattern.matcher(passage);
//        //3开始循环匹配
//        while(matcher.find()){
//            System.out.println("find:"+matcher.group(0));
//        }
        FileReader fileInput = null;
        try {
            fileInput = new FileReader("src/main/java/zzuli/learnjava/Lambada_/qucikstart/baiduM.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader input = new BufferedReader(fileInput);
        StringBuilder sb = new StringBuilder();
        try {
            String line=null;
            while ( (line = input.readLine()) != null) {
                sb.append(line + "\n");
            }
        }catch (IOException e){

        }
        String passage = sb.toString();
        Pattern pattern = Pattern.compile("<a (\\S*)>(\\S*)</a>");
        Matcher matcher = pattern.matcher(passage);
        while(matcher.find()){
            System.out.println(matcher.group(2));
        }
    }
}
