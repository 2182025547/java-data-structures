package com.yitiancode._02args.override;

public class Dog extends pet{
    public void cry(){
        System.out.println( "dog : 汪汪");
    }
    public void cry(String type){
        System.out.println(type+": 嗷呜");
    }
}
