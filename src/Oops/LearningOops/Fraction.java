package LearningOops;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();

    }

    public Fraction() {
        this.numerator = numerator;
        this.denominator = denominator;
//        simplify();

    }

    public void setNumerator(int num) {
        this.numerator = num;
//        simplify();
    }

    public void setDenominator(int denom) {
        this.denominator = denom;
//        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void print() {
        simplify();
        System.out.println("..........................................");
        System.out.println(numerator + "/" + denominator);
    }

    public void increment() {
        numerator = numerator + denominator;
//        simplify();
    }

    public static Fraction add(Fraction f1, Fraction f2) {
       int nume= f1.numerator * f2.denominator + f2.numerator * f1.denominator;
     int    denom= f1.denominator*f2.denominator;
        Fraction f3=new Fraction(nume,denom);
        return f3;
    }

    public void add(Fraction f2) {
      this.numerator=  this.numerator * f2.denominator + this.denominator * f2.numerator;
      this.denominator=  this.denominator* f2.denominator;
    }
}

