package CNCourse;

import java.util.Scanner;
public class InterstingAlphabets {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char ch=(char)('E'-i+1);
            while(j<=i){

                System.out.print(ch);
                j++;
                ch=(char)(ch+1);


            }
            System.out.println();
            i++;
        }
    }
}
