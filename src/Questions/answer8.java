import java.util.Scanner;

public class answer8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Inter a count ");
        int count=sc.nextInt();
        int a=0,b=1,c,i;

        for(i=0;i<count;i++){
            c=a+b;
            System.out.print(a+"  ");
            a=b;
            b=c;
        }
    }
}

