package com.course;


public class Methods_with_static {
    static int logic(int x,int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=12;
        c=logic(a,b);
        System.out.println(c);
    }
}


