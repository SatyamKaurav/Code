import  java.util.Scanner;
public class Patern4 {
    public static void main(String[] args) {


/*

        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;

            while(j<=n){
                char jthChar=(char)('A'+j-1);

                System.out.print(jthChar);

                j++;

            }
            System.out.println("" + "");
            i++;
        }
*/
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;

        while(i<=n){

            int j=1;


            while(j<=i){

                char ch=(char)('A'+i-1);

                System.out.print(ch);

                j++;

            }


            System.out.println();
            i++;
        }
    }
}
