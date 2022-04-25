package com.course;

public class breakandcontinue {
    public static void main(String[] args) {
        //Break and continue
        int i = 1;
        while(true)
        {
            if(i==5){
                i=i+1;
                continue;
            }
            System.out.println(i);
            i++;
            if(i>10)
            {
                break;
            }
        }
    }
}
