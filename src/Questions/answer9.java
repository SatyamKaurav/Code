import java.util.Scanner;

public class answer9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Inter a count ");
        int count=sc.nextInt();
        int a=0,b=1,c,i=0;

        while (i<count){
            System.out.print(a+"  ");
            c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
}

