package com.learing;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inter the number of fibo to print : ");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b);

        for(int count=2;count <=n;count++){
            int temp=a+b;
            a=b;
            b=temp;
            System.out.print(" "+temp);




        }


    }
}
