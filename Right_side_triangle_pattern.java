package com.course;

import java.util.Scanner;

public class Right_side_triangle_pattern {
    public static void main(String[] args) {
        int i,j,k;
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number for row = ");
        n=s.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=i;j<n;j++)
            {
                System.out.print("  ");
            }
            for (k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
