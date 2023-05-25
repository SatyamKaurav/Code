package LearingOOPs;

public class Main {
    public static void main(String[] args) {


    Vehicale v=new Vehicale(2);
    Car c=new Car(2,5,7);
    Nano n=new Nano(2,5);
        System.out.println(n.modelNo+"|"+n.noOfDoors+"|"+n.price+"|"+n.noOfSeats);
    }
}
