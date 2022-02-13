package com.company;

import java.util.ArrayList;

public class createArray {

    static ArrayList ar1 = new ArrayList();


    public static void addValue(int num){
            ar1.add(num);
    }

    public static boolean isExist(int num){
        for(Object a : ar1){
            if(a.equals(num))
                return false;
        }
        return true;
    }

    public static void writeArray(){
        System.out.println("Your array : ");
        for(Object a : ar1)
            System.out.print(a + " ");
    }


}
