package com.course;

import java.util.Scanner;

public class Pyramid_pattern {
    public static void main(String[] args) {

        int i,j,k;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value for row = ");
        int n=s.nextInt();
        for (i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {

                System.out.print("  ");
            }
            for(k=1;k<i;k++)
            {
            System.out.print("* ");
             }
            for (int l=1;l<=i;l++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
