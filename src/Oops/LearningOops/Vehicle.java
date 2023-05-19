package LearningOops;

public class Vehicle {
//    String colour;
//    int number;
//}
//
//class Car extends Vehicle{
//    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
//        v.colour = "black";
//        v.number = 8486;
//        System.out.println(v.number + " " + v.colour);
//    }
    /*
//String colour;
//    private int number;
//    void set(int number)
//    {
//        number=number;
//    }
//    int get()
//    {
//        return number;
//    }
//}
//
//class Car extends Vehicle{
//    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
//        v.colour = "white";
//        v.set(1010) ;
//        System.out.println(v.colour + " " + v.get());
//    }
*/
    /*
String colour;
    private int number;
    void print()
    {
        System.out.println("vehicle");
    }
}

class Car extends Vehicle{
    void print()
    {
        System.out.println("car");
    }
}
class Honda extends Car{
    void print()
    {
        System.out.println("Honda");
    }
}
class buy_car{
    public static void main (String[] args) {
        Car c=new Car();
        c.print();
    }
*/
String colour;
    private int number;
    void print()
    {
        System.out.println("vehicle");
    }
}

class Car extends Vehicle{
    void print()
    {
        System.out.println("car");
    }
}
class Honda extends Car{
    void print()
    {
        System.out.println("Honda");
    }
}
class buy_car{
    public static void main (String[] args) {
        Honda c=new Honda();
        c.print();
    }
}


