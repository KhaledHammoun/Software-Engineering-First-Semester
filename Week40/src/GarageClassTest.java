import javax.swing.*;

public class GarageClassTest
{
  public static void main(String[] args)
  {
    Car firstCar = new Car("Audi", "A4", "White", "PA8596KH", 2009);
    Car secondCar = new Car("Citroen","C4", "Black", "AM53484", 2013);
    Garage firstGarage = new Garage();

    firstGarage.park(firstCar, 1);
    firstGarage.park(secondCar, 2);
    
    System.out.println("is place 2 taken: " + firstGarage.isParkingAreaTaken(2));

    Car newCar = firstGarage.leaveGarage(2);

    System.out.println(newCar);
    System.out.println("Is park 2 free now: " + firstGarage.isParkingAreaTaken(2));

    Garage secondGarage = new Garage();

    System.out.println("Are they equal: " + firstGarage.equals(secondGarage));
    System.out.println(firstGarage);

  }
}
