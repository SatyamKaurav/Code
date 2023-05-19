import java.util.Scanner;
public class answer3 {
    public static void main(String[] args) {
       // Java Program to check if number is even or odd
        Scanner sc=new Scanner(System.in);
        System.out.println("Inter your number");
        int a= sc.nextInt();


        if(a%2==0){
            System.out.println(a+" is even");

        }
        else{
            System.out.printf(a+" is odd");
        }
    }
}
