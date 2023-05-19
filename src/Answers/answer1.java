package Answers;

import java.util.Scanner;
public class answer1 {
    public static void main(String[] args) {
        //Taking user input using Scanner class
   Scanner sc=new Scanner(System.in);
        System.out.println("Inter first number");
        int a=sc.nextInt();
        System.out.println("Inter Secound number");
        int b=sc.nextInt();
        System.out.println("Inter Third number");
        int c=sc.nextInt();
        // using if else if 
        if(a>=b && a>=c){
            System.out.println("Greater number is "+a);
        } else if (b>=a && b>=c) {
            System.out.println("Greater number is"+b);
        }
        else {
            System.out.println("Greater number is "+c);
        }
    }
}
