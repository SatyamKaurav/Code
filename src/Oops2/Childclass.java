package Oops2;

public class Childclass extends Baseclass {
    double weight;

 Childclass(){
    this.weight= -1;

}

    public Childclass(double l, double w, double h, double weight) {
        super(l, w, h);
        //what is this?
        // This is basically saying that call the parent class constructor
        this.weight = weight;
    }

   protected  Childclass(double l, double w, double h) {
        super(l, w,  h);
    }
}
