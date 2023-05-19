import java.util.Scanner;
public class mirrorPatter {
    public static void main(String[] args) {
        /* Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int spaces=1;

            while(spaces<=n-i){

                System.out.print(" ");
                spaces=spaces+1;
            }
            int stars=1;
            while(stars<=i){
                System.out.print(stars);
                stars=stars+1;
            }
            System.out.println();
            i=i+1;
        }
        */
        /*Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;


        while (i<=n){
            int spaces=1;
            while(spaces<=n-i){

                System.out.print(" ");
                spaces=spaces+1;

            }
            int p=i;
            int j=1;
            while(j<=i){
                System.out.print(p);
                j++;
                p++;

            }
            int dec=1;
            int h=i;
            while(dec<=i-1){

                if(i==2){
                    System.out.print(i);
                }else if (i==3) {
                System.out.print(h+1);
                }
                else if(i==5){
                    System.out.print(h+3);

                }else {
                    System.out.print(h+2);

                }
                dec++;
                h--;
            }
            System.out.println();
            i++;

        }*/
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;


        while (i<=n){
            int spaces=1;
            while(spaces<=n-i){

                System.out.print(" ");
                spaces=spaces+1;

            }
            int p=i;
            int j=1;
            while(j<=i){
                System.out.print(p);
                j++;
                p++;

            }
            int dec=1;
            int h=i;
            while(dec<=i-1){

                if(i==2){
                    System.out.print(i);
                }else if (i==3) {
                    System.out.print(h+1);
                }
                else if(i==5){
                    System.out.print(h+3);

                }else {
                    System.out.print(h+2);

                }
                dec++;
                h--;
            }
            System.out.println();
            i++;

        }
    }
}
