package LearingOOPs;

public class Car extends Vehicale {
  int noOfSeats;

  public Car() {
  }

  public Car(int noOfSeats) {
    this.noOfSeats = noOfSeats;
  }

  public Car(int modelNo, int noOfDoors) {
    super(modelNo, noOfDoors);
  }

  public Car(int modelNo, int noOfDoors, int noOfSeats) {
    super(modelNo, noOfDoors);
    this.noOfSeats = noOfSeats;
  }

}
