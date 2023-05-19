package Answers;

import java.util.Scanner;
public class answer5 {
    public static void main(String[] args) {
        //Java Program to make a Simple Calculator(+,-,*,%,/) using Switch Case
     Scanner sc=new Scanner(System.in);
             System.out.println("Inter your first number");
             int a=sc.nextInt();
             System.out.println("Inter your second number");
             int b=sc.nextInt();
             System.out.println("inter the function");
             char fun= sc.next().charAt(0);

             switch (fun){
                 case '+':
                     System.out.println("Sum of a+b is "+(a+b));
                     break;
                 case '-':
                     System.out.println("Subtractions of a-b is "+ (a-b));
                     break;
                 case '*':
                     System.out.println("Multiplication of a*b is "+(a*b));
                     break;
                 case '%':
                     System.out.println("Reminder of a%b is "+(a%b));
                     break;
                 case '/':
                     double c=a/b;
                     System.out.println("Division of a/b is "+c);
                     break;
                 default:
                     System.out.println("Noting to calculate");

             }


    }

}

