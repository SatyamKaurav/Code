package Oops.LearningRecursion;

public class Print1ton {
    public static void print1ton(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(" " + n + " ");
        print1ton(n - 1);


    }

    //..................................................................................................................
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int fib_1 = fib(n - 1);
        int fib_2 = fib(n - 2);
        int output = fib_1 + fib_2;
        return output;
    }
/*public static boolean isShortedBetter(int[] a,int n){
        if (n==a.length-1){
            return true;
        }

}*/
    //..................................................................................................................
    public static boolean isShorted(int a[]) {
        //here we have taken complete care of PMI here
        if (a.length == 1) {
            return true;
            //base case check
        }
        if (a[0] > a[1]) {
            return false;
        }
        int smallArray[] = new int[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            smallArray[i - 1] = a[i];
        }
        boolean isSmallArraySorted = isShorted(smallArray);
        // if the smaller array is sorted then the bigger is sorted
        return isSmallArraySorted;
    }

    //..................................................................................................................
    public static int arraySum(int[] a,int n) {
        if (a.length == 1) {
            return a[a.length - 1];
        }/*
        int smallArray[]=new int[a.length-1];
        for (int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];
        }
        return a[0] + arraySum(smallArray);*/
        return a[0]+arraySum(a,n-1);
    }

    //................................................ .....................................................
public static boolean findNumInArray(int[] a ,int n){
        if (a[0]==n){
            return true;
        }
        
        return findNumInArray(a,n);
}
    //........................................................................................
    public static void main(String[] args) {
//        print1ton(10);
//        System.out.println(fib(3));
//       boolean res= isShorted(arr);
        int[] arr = {1, 2,3,4,5,6};
        int sum = arraySum(arr,6);
//        boolean res=findNumInArray(arr,2);
        System.out.println(sum);

    }
}
