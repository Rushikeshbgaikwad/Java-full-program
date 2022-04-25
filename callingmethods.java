package com.course;

public class callingmethods {
    public static void printname(){
        System.out.println("Rushikesh Babu Gaikwad");
    }
    public static void printaddress(){
        System.out.println("Prakash nagar latur");
    }
    public static void fullname(String name){
        System.out.println(name);
    }
    public static void printsum(int q,int w){
        int e=q+w;
        System.out.println(e);
    }
    public static void main(String[] args) {
        //METHODS
        printname();
        printaddress();
        fullname("Hi my fullname is rushikesh babu gaikwad");
        printsum(5,9);
        ;

    }
}
