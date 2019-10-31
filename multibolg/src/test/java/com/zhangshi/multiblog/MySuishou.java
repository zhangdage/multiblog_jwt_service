package com.zhangshi.multiblog;

import java.math.BigDecimal;
import java.util.Scanner;

public class MySuishou {

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        float n = input.nextFloat();

        MySuishou myS = new MySuishou();
        BigDecimal resul =  myS.compute(n);

        double res = resul.doubleValue();

        System.out.println(res);
    }
    public BigDecimal compute(float n){
        BigDecimal bN = new BigDecimal(n);

        if(n<=3000){
            return new BigDecimal(0);
        }else if(n>3000 && n<=5000){
            BigDecimal re1 = new BigDecimal(5000).subtract(bN);
            BigDecimal re2 = re1.multiply(new BigDecimal(0.05));
            return  re2;
        }else if(n>5000 && n<=20000){
            BigDecimal re1 = new BigDecimal(20000).subtract(bN);
            BigDecimal re2 = re1.multiply(new BigDecimal(0.1));
            return  re2;
        }else if(n>20000){
            BigDecimal re1 = bN.subtract(new BigDecimal(20000));
            BigDecimal re2 = re1.multiply(new BigDecimal(0.15));
            return  re2;
        }else {
            return  null;
        }
    }

}
