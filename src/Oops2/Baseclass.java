package Oops2;

public class Baseclass {
    double l;
    double h;
    double w;


    Baseclass() {
         super();

        this.h = -1;
        this.l = -1;
        this.w = -1;

    }

    //cube
    Baseclass(double side) {
        this.h = side;
        this.l = side;
        this.w = side;

    }

    Baseclass(double l, double w, double h) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

}

