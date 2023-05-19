import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        int a=0;
        int N=s.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=s.nextInt();
        }


        for(int i=0;i<N;i++){
            a=arr[i]+a;

        }
        System.out.println(a);


    }
}
