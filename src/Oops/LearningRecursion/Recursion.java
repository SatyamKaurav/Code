package Oops.LearningRecursion;

public class Recursion {
//    public static int fact(int a ){
//        if (a==0){
//            return 1;
//
//        }
//        int smallInput=fact(a-1);
//        int output=a*smallInput;
//        return output;
//    }

    public static void main(String[] args) {
        int n=90;
        int temp=1;
        for (int i=1;i<=n;i++){
            temp*=i;
        }
        System.out.println(temp);
    }
}
