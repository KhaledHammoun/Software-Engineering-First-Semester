import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CarClassTest
{
  public static void main(String[] args)
  {
    String[] data = null;
    MyTextFileIO myTextFileIO = new MyTextFileIO();
    try
    {
      data = myTextFileIO.readArrayFromFile(
          "C:\\Users\\X1\\IdeaProjects\\Workspace\\Week46\\src\\carsToAdd.txt");
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found.");
      System.exit(1);
    }
    CarList cars = new CarList();
    for (String str : data)
    {
      String[] temp = str.split(",");
      String regNumber = temp[0];
      String make = temp[1];
      String model = temp[2];
      int year = Integer.parseInt(temp[3]);
      Owner owner = new Owner(temp[4], temp[5]);
      cars.addCar(new Car(regNumber, make, model, year, owner));
    }
    System.out.println();
    CarFileAdapter fileAdapter = new CarFileAdapter("C:\\Software Engineering VIA\\1.Semester One\\SDJ\\Excercises\\cars.bin");

    fileAdapter.addCars(cars);

    CarList getCars = fileAdapter.getAllCars();

    System.out.println(getCars);
  }
}
