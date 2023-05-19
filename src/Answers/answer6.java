package Answers;

import java.util.Scanner;
public class answer6 {
    public static void main(String[] args) {
       // Java Program to find sum of natural numbers using for loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Inter N ");
        int N=sc.nextInt();
        int i ,sum=0;
        for(i=0;i<=N;i++){

        sum=sum+i;
        }

        System.out.println("Sum of N natural Number is "+sum);
    }
}

