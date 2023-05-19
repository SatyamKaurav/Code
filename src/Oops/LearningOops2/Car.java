package LearningOops2;

public class Car extends Vehicals {
    int numberOfDors;

    public void printCar() {
        System.out.println("Vehical name " + name + " Color " + getColor() + " Speed " + maxSped + " NumberOfDors " + numberOfDors);

    }

//    Here what's happening is that the function override take place
//    when I am calling the print function in the VechicalUse the print fn first  check the car class if there is any print
//    function or not then it will check in Vehicle class which is the parent class
    public void print() {
        System.out.println("Car name " + name + " Color " + getColor() + " Speed " + maxSped + " NumberOfDors " + numberOfDors);

    }
}
