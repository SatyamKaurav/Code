import java.util.Scanner;

public class answer10 {
    public static void main(String[] args) {
        // Java Program to find factorial using while loop
        int fatrl=1,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Inter a number");
        int Number=sc.nextInt();

        while (i<=Number)
        {
            fatrl=fatrl*i;
            i++;
        }
        System.out.println("Factorial of "+Number+" is "+fatrl);
    }
}

