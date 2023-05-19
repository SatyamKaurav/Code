package CNCourse;

import java.util.Arrays;

public class arrayinsertion {
    public static void insertion(int a[], int b[]) {
        int m = a.length;
        int n = b.length;

        Arrays.sort(a);

        Arrays.sort(b);


        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (a[i] == b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void equlibrm(int[] a) {

        int n = a.length;
        int totalSum = 0;
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += a[i];
        }

        for (int i = 0; i < n; i++) {
            totalSum -= a[i];
            if (leftSum == totalSum) {
                return;
            }
            leftSum += a[i];
        }

    }




    public static void main(String[] args) {
        int c[] = {1, 4, 2, 3, 2};
        int b[] = {2, 9, 8};
//        insertion(a, b);
        equlibrm(c);
    }
}
