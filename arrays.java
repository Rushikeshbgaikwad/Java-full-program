package com.course;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int phy = 97;
        int che = 95;
        int eng = 91;

        //array
        int[] marks = new int[3];
        marks[0]=94;
        marks[1]=92;
        marks[2]=91;
        System.out.println(marks[1]);

        //length
        System.out.println(marks.length);

        //sort   //after the sort 91,92,94
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //another method
        int[] marks2 = {60,62,68};
        int[][] finalmark = {{10,15,18,20},{30,32,35,38}};
        System.out.println(finalmark[0][3]);


        int marks1[] =new int[5];
        marks1[0]=85;
        marks1[1]=86;
        marks1[2]=87;
        marks1[3]=88;
        marks1[4]=89;
        System.out.println(marks1[3]);
    }
}
