package com.zhangshi.multiblog.myexamination;

import java.util.Scanner;

public class MyGetWaterMoveTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String str = input.next();

        int[] array = new int[3];
        for(int i=0;i<array.length;i++){
            array[i] = input.nextInt();
            String strs = input.next();
            if(strs == " "){
                continue;
            }
        }
        if((array[0]+array[1])>array[2]){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
