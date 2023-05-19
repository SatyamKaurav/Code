package LearningOops2_Temp;

import LearningOops2.Car;
import LearningOops2.Vehicals;

public class VehicalsUse {
   public static void main(String[] args) {
      Vehicals V=new Vehicals();

//      V.maxSped=10;

      Truck T=new Truck();
      T.maxCapacity=50;
      T.setColor("Red");
      T.print();
   }



}
