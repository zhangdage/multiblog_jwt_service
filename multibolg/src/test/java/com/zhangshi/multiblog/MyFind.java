package com.zhangshi.multiblog;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyFind {

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        String str=input.next();

        Map<String,String> map = new HashMap<>();
        map.put("001","小明");
        map.put("002","小红");
        map.put("003","小白");
        map.put("004","小新");
        map.put("005","小李");
        map.put("006","小张");

        System.out.println(map.get(str));

    }

}
