package Oops.LearningRecursion;

public class PowerCalculation {
    public static long power(long x, long n){
//        if(n==0){
//            return 1;
//        }
//        int smallOutput=pow(x,n-1);
//        int output=x*smallOutput;
//
//        return output;
        if (x == 0 && n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        long smallAns = power(x, n / 2);
        if (n % 2 == 0) {
            return (smallAns * smallAns);
        } else {
            return (x * smallAns * smallAns);
        }
    }


    public static void main(String[] args) {
        System.out.println(power(9,18));
    }
}
