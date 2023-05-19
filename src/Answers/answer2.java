package Answers;

import java.util.Scanner;
public class answer2 {
    public static void main(String[] args) {
       // Java Program to check if number is positive or negative
        Scanner sc=new Scanner(System.in);
        System.out.println("Inter a number");
        int number= sc.nextInt();
        if(number>=0)
        System.out.println("Number is positive");
        else
            System.out.println("Number is negative");


    }
}

