package com.course;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //loop
        //print 1 to 100

        //for loop
//        for (int i=1;i<=100;i++)
//        {
//            System.out.println(i);
//        }
//        System.out.println("next loop is while");
//
//        //while loop
//        int i=100;
//        while(i>=1)
//        {
//            System.out.println(i);
//            i--;
//        }
//
//        //do while loop
//        System.out.println(" it is do while program in java ");
//        int j=1;
//        do {
//            System.out.println(j);
//            j++;
//        }while(j<=100);
//
        // do while program
        int num;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter you number = ");
            num = sc.nextInt();
            System.out.println("here your enter number is = "+num);
        }while(num>=0);
        System.out.println("this game is END");
    }
}
