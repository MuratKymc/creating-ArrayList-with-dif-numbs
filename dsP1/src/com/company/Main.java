package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        createArray cA = new createArray();

        System.out.println("Enter a number.");
        int number = input.nextInt();

        while(cA.isExist(number)){
            cA.addValue(number);
            System.out.println("Enter a value.");
            number = input.nextInt();
        }

        cA.writeArray();
    }

}
