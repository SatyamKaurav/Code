import java.util.Scanner;
public class funt {
    public static void printFahrenheitTable(int start, int end, int step) {
        for(int i=start;i<=end;i+=step){
            int conver=(i-32)*5/9;
            System.out.println(i+" "+conver);
        }

    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int S=s.nextInt();
        int E=s.nextInt();
        int W=s.nextInt();
        printFahrenheitTable(S,E,W);
    }


}