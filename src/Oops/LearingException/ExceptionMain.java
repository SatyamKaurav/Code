package Oops.LearingException;

public class ExceptionMain{
    public static int divide(int a,int b) throws DivideByZeroException{
        if(b==0){
/*
            throw new DivideByZeroException();
            this is giving error because this we created an exception  is a checked exception
            now system of compiler will expect from you to decide what should be the step once's that exception is accrued
*/
            //what should be the step you should call on
            //1.Handel the Exception or you can
            //If you are dealing with it using Try and Catch method
            //After the Try and Catch method the main f^n will be executed






            //2.Pass the Exception(Pass to whom :- Pass to who so over call this f^n )
            //If you decide to pass it you can throw an exception
            throw new DivideByZeroException();
        }
        return a/b;
    }/*
      1. 1st way to deal with it


    public static void main(String[] args) throws DivideByZeroException{
        divide(10,0);
//
//        try {
//            divide(10,0);
//        } catch (DivideByZeroException e) {
//            System.out.println("Dividing with zero is not allow");
////            throw new RuntimeException(e);
//        }
    }*/
//....................................................................................................
    //2nd method
    public static void main(String[] args) {
        try {
            divide(10,0);
        } catch (DivideByZeroException e) {
            System.out.println("Dividing with zero is not allow");
//            throw new RuntimeException(e);
        }

    }
}
