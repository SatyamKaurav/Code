package Oops2;

public class Subchild extends Childclass {
    int price;
    public Subchild(){
super();
    }
    Subchild(int price){
        this.price=price;

    }
Subchild( double l,double w ,double h,double weight){
        super(l,w,h,weight);

}

    public Subchild(double l, double w, double h,  int price) {
        super(l, w, h);
        this.price = price;
    }
}
