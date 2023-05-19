package CNCourse;

import java.util.Scanner;
public class statementBreakContinue {
    public static void main(String[] args) {
//        int i=1;
//        int n=5;
//        while(i<=n){
//            i++;
//            if(i==4){
//                continue;
//            }
//            System.out.println(i);
//        }
//========================================================================================================
//        int i=1;
//        int n=5;
//        while(i<=n){
//
//            if(i==4){
//                continue;
//            }
//            i++;
//            System.out.println(i);
//        }
//=====================================================================
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();


        for(int i=2 ;i<=n;i++)
        {
            int count=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==1)
                System.out.println(i);
        }





//            if(i%2 !=0){
//                System.out.println(i);
//            }









    }
}
