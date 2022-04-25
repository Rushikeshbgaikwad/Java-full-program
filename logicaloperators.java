package com.course;

import java.util.Scanner;

public class logicaloperators {
    public static void main(String[] args) {
        //logical operators
        //&& = for both condition
        //|| = for one condition
        //!= = negative condition
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        if (a < 50 && b < 50)
            System.out.println("both number is less than 50");
        else
            System.out.println("at least is no is greater than 50");

    }
}