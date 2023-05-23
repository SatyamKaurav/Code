package Oops2;

public class Main {
    public static void main(String[] args) {
        Baseclass b = new Baseclass(4);
        Baseclass b1 = new Baseclass(4, 2, 5);
        Childclass c = new Childclass(4, 2, 5, 20);
        System.out.println(b1.l + " " + b1.h + " " + b1.w);
        System.out.println(c.w + " " + c.h + " " + c.l + " " + c.weight);

// error        Baseclass b2 = new Childclass(2, 4, 2, 50);
// error        System.out.println(b2.weight);
// error        Childclass c1=new Baseclass(2,4,5);

    }
}