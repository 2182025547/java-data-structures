package zzuli.learnjava.reflection_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author songyitian
 * @date 2023/3/8
 * @time 21:43
 * description:
 */
public class ReflectionquickStart {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /**
         * 传统
          */
        Cat cat = new Cat();
        cat.hi();

        //尝试利用反射做一下
        Properties properties = new Properties();
        // 利用properties获取信息
        properties.load(new FileInputStream("src/main/java/zzuli/learnjava/re.properties"));
        String classpath = properties.getProperty("classfullpath");
        Object classfullpath = properties.get("classfullpath");
        System.out.println(".get"+classfullpath);
        String method = properties.getProperty("method");
        System.out.println(classpath+"-"+method);
        //利用re.properties创建类
        //1加载类，返回Class类型的对象aClass
        Class<?> aClass = Class.forName(classpath);
        //2通过aClass得到你加载的类的对象实例
        Object o = aClass.newInstance();
        //3.通过aClass得到加载的类的方法
        Method method1 = aClass.getMethod(method);
        //4.通过method调用方法：即通过方法对象来实现调用方法
        method1.invoke(o);
    }
}
