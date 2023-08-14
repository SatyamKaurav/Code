package DataStructure.Array;
import java.util.Arrays;
import  java.util.Scanner;
public class Arrayuse {
    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner  in=new Scanner(System.in);


        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();

        }
        //Method 1
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
        System.out.println();
        //method 2

        for (int a : arr){
            System.out.print(a);
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));
    }
}
