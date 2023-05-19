package Answers;

import java.util.Scanner;
public class answer4 {
    public static void main(String[] args) {
        //Java Program to check whether a char is vowel or Consonant using Switch Case

        Scanner sc=new Scanner(System.in);
        System.out.println("Inter char here");
        char ca=sc.next().charAt(0);
        switch (ca){
            case 'A':
                System.out.println("Char is vowel");
                break;
            case 'E':
                System.out.println("Char is vowel");
                break;
            case 'I':
                System.out.println("Char is vowel");
                break;
            case 'O':
                System.out.println("Char is vowel");
                break;
            case 'U':
                System.out.println("Char is vowel");
                break;
            case 'a':
                System.out.println("Char is vowel");
                break;
            case 'e':
                System.out.println("Char is vowel");
                break;
            case 'i':
                System.out.println("Char is vowel");
                break;
            case 'o':
                System.out.println("Char is vowel");
                break;
            case 'u':
                System.out.println("Char is vowel");
                break;
            default:
                System.out.println("Char is consonant");
        }

    }
}

