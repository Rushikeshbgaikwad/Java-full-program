package com.course;

import java.util.Scanner;

public class Right_side_patter_downside {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value for row = ");
        n=s.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for (k=n;k>=i;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
