package LearingOOPs;

public class Nano extends Car{
    int price;

    public Nano() {
    }

    public Nano(int price) {
        this.price = price;
    }

    public Nano(int noOfSeats, int price) {
        super(noOfSeats);
        this.price = price;
    }

    public Nano(int modelNo, int noOfDoors, int price) {
        super(modelNo, noOfDoors);
        this.price = price;
    }

    public Nano(int modelNo, int noOfDoors, int noOfSeats, int price) {
        super(modelNo, noOfDoors, noOfSeats);
        this.price = price;
    }
}
