package com.course;

public class expectionhandling {
    public static void main(String[] args) {
        int[] marks = {98,95,12};
        try {
            System.out.println(marks[5]); //that line we get error that why we use try catch
        }
        catch(Exception exception) {
            //do something after catching
        }
        System.out.println("my name is Rushikesh");


    }
}
