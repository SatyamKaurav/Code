package LearningOops;
import java.util.Scanner;
public class ComplexNumberUse {
    public static void main(String[] args) {
//        ComplexNumber c1 = new ComplexNumber(2, 3);
//        c1.print();
////        c1.setReal(2);
////        c1.setImaginary(3);
////        c1.print();
////        c1.print();
//
//
//        ComplexNumber c2 = new ComplexNumber(5, 2);
//        c1.add(c2);
//        c2.print();
//        c1.print();
//    }

        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumber c1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber c2 = new ComplexNumber(real2, imaginary2);

        int choice = s.nextInt();

        if (choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        } else if (choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        } else {
            return;
        }


    }
}