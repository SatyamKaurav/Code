package Practice;


public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 4, 8, 7, 9};
        int index = binarySearch(arr, 7);System.out.print("[");
        for(int j = 0; j <arr.length; j++){

            System.out.print(","+arr[j]);


        } System.out.print("]");
        System.out.println();
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int i) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] < i) {
                s = mid + 1;
            } else if (arr[mid] > i) {
                e = mid - 1;
            } else {
                return mid;
            }
        }


        return -1;
    }
}