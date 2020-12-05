public class CarClassTest
{
  public static void main(String[] args)
  {
    Car firstCar = new Car("Audi", "A4", "White", "PA8596KH", 2009);
    Car secondCar = new Car("Citroen", "C4", "Black", 2013);
    Car thirdCar = new Car("VW", "Polo", "Gray", "BT81100", 2012);

    System.out.println(firstCar.equals(secondCar));
    Car copyCar = firstCar.copy();
    copyCar.setColour("Black");
    System.out.println("Copy car: " +copyCar);
    System.out.println("Audi car: " + firstCar);
    System.out.println("No number plate car: " + secondCar);
  }
}
