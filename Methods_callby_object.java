package com.course;

public class Methods_callby_object {
    int logic(int x,int y)
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
        b=11;
        Methods_callby_object obj=new Methods_callby_object();
        c=obj.logic(a,b);
        System.out.println(c);
    }
}
