package com.yitiancode._02args;
import com.yitiancode._02args.override.*;
/**
 * 可变个数的形参方法
 * 用法：参数类型 ... 变量名
 * 可变个数形参最多在方法的参数列表中出现一次i
 */
public class ArgsTest {

    public static void print(int ... nums){
        for(int num:nums){
            System.out.println(num);
        }
    }



    public static void main(String[] args) {
//        int a[] = {1,2,3,4,5};
//        print(new int[]{1,2,3});
        pet dog = new Dog();
        dog.cry();
        //不能调用子类特有的方法,如果要使用子类的特有方法则必须向下转型： Dog d1 = (Dog)dog;
        //        dog.cry("erha");
        //建议在向下转型之前使用instanceof进行类型判断，避免出错：ClassCastException

        pet cat  = new Cat();
        cat.cry();
        if(cat instanceof Dog){
            // instanceof 使用说明: 变量 instanceof Class
            //判断变量是否是class这种类型
            Dog d2 = (Dog)cat;
            cat.cry();
        }
        else {
            System.out.println("猫不是狗");
        }

    }

}
