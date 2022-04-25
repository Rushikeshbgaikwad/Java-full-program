package com.course;

import java.util.Scanner;

public class funproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100);
        int num1,n=1;
        System.out.println("GUESS THE NUMBER !");
        while(n<9) {
            System.out.print("Enter your number = ");
            num1=sc.nextInt();
            if (num1==num){
                System.out.println("your guess is \"CORRECT\"");
                break;
            }
            else if (num1>num)
            {
                System.out.println("your guess is large");
            }
            else
                System.out.println("your guess is small");
            n=n+1;
        }//while(num1>=0);
        System.out.println("Game End");
    }
}
