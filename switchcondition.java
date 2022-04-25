package com.course;

import java.util.Scanner;

public class switchcondition {
    public static void main(String[] args) {
        //condition statement - switch
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the no of day(1 to 7) = ");
        int day = num.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wenesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saterday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("You enter the wrong word. please do it again");

        }
    }
}
