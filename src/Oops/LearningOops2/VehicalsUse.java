package LearningOops2;

public class VehicalsUse {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "maruti";
        c.maxSped = 20;
//        c.numberOfDors=4;

//c.color="Black";
        c.setColor("Black");
        c.print();
//        c.printCar();
    }
}
