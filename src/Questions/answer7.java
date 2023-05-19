package Questions;

import java.util.Scanner;
public class answer7 {
    public static void main(String[] args) {
        int fatrl=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Inter a number");
        int Number=sc.nextInt();

        for(i=1;i<=Number;i++)
        {
            fatrl=fatrl*i;
        }
        System.out.println("Factorial of a is "+fatrl);
    }
}

