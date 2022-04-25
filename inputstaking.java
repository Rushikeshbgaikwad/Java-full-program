package com.course;

import java.util.Scanner;

public class inputstaking {
    public static void main(String[] args) {
        Scanner ru = new Scanner(System.in);
        //how to take input as number from user
        System.out.println("Enter the two number = ");
        int a = ru.nextInt();
        float b = ru.nextFloat();
        long c = ru.nextLong();
        System.out.println((int) a );
        System.out.println(b);


        String name = ru.next();  // it is print just a word, it is not consider space,it is not count a space
        String fullname = ru.nextLine();  // it is print a full sentance or whole string and space also,it count also a space
        System.out.println(name);
        System.out.println(fullname);
    }
}
