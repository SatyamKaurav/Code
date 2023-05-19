package CNCourse;

import java.util.Scanner;

public class maxElement {
    public static int[] takingInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Inter the size of the array");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Inter the value of "+i+"th value");
            arr[i]=s.nextInt();
        }
        return arr;
    }
public static int maxvalue(int[] arr){
        int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }

    }
    return max;
}

    public static void main(String[] args) {
       /* int max=Integer.MIN_VALUE;
        Scanner s=new Scanner(System.in);
        System.out.println("Inter the size of the array");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Inter the value of "+i+"th value");
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum value of the array is  "+max);
*/
  int arr[]=takingInput();
  int lar=maxvalue(arr);
        System.out.println("your max value");
        System.out.println(lar);
        Scanner s=new Scanner(System.in);
      System.out.println(s);
    }
}
