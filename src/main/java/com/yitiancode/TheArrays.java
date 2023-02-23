package com.yitiancode;


import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "blue";
        colors[1] = "purple";


        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);

        colors[2] = "yellow";
    }
}
