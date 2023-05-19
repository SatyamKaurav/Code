package LearningRecursion;

public class isSortedBetter {
    public static boolean isShortedBetter(int[] a,int n){
        if (n==a.length-1){
         return true;
        }
        if (a[n]>a[n+1]){
            return false;
        }
        boolean isSmallArraySorted=isShortedBetter(a,n+1);
        return isSmallArraySorted;
    }
    public static void main(String[] args) {
int[] arr={1,2,3,4,5,6};
boolean res=isShortedBetter(arr,5);
        System.out.println(res);
    }
}
