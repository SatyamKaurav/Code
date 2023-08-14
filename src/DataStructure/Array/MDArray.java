package DataStructure.Array;

import java.util.Scanner;

public class MDArray {
    public static void main(String[] args) {
/*
     Multidimensional array 2D

     int[][] arr= new int[row][colm];
         **OR**
         int[][] arr={
               {1,2,3},
               {4,5,6},
               {7,8,9}
         };
 */
        Scanner in=new Scanner(System.in);
        int[][] arr= new int[3][3];

        for (int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }

        }
// Output
        for (int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                System.out.println(arr[row][col]);
            }
            System.out.println();
        }
    }
}
