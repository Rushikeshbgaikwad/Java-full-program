package com.course;

import java.util.Locale;

public class stringmethods {
    public static void main(String[] args) {
        //string

        //concatenete
        String first = "Rushikesh ";
        String middle = "Babu ";
        String last = "Gaikwad";
        String fullname = first+middle+last;
        System.out.println(fullname);

        //charAt
        System.out.println(first.charAt(7));

        //replace
        System.out.println(first.replace("sh","$"));
        String name =(first.replace("R", "RRR"));
        System.out.println(name);

        //substring
        System.out.println(fullname.substring(0,13));
        System.out.println(fullname.substring(10 ,16));


    }
}
