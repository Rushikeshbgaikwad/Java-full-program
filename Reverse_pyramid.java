package com.course;

import java.util.Scanner;

public class Reverse_pyramid {
    public static void main(String[] args) {
        int i,j,k,l,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value for row = ");
        n=s.nextInt();
        for (i=1;i<=n;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(k=i;k<=n;k++)
            {
                System.out.print("* ");
            }
            for(l=i;l<n;l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
