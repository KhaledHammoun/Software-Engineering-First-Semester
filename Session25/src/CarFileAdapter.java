import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public class CarFileAdapter
{
  private String fileName;
  private MyFileIO myFileIO;

  public CarFileAdapter(String fileName)
  {
    myFileIO = new MyFileIO();
    try
    {
      myFileIO.writeToFile(fileName, new CarList());
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found. (constructor)");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("Error write. (constructor)");
      System.exit(1);
    }
    this.fileName = fileName;
  }

  public CarList getAllCars()
  {
    var temp = new CarList();

    try
    {
      temp = (CarList)myFileIO.readObjectFromFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found. (get all cars");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO error reading from file. (get all cars)");
      System.exit(1);
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Object not found. (get all cars");
      System.exit(1);
    }
    return temp;
  }
  public void saveChanges(CarList cars)
  {
    try
    {
      myFileIO.writeToFile(fileName, cars);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found. (save changes)");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("Error writing on file. (save changes)");
      System.exit(1);
    }
  }

  public void addCar(Car car)
  {
    var temp = getAllCars();
    temp.addCar(car);

    saveChanges(temp);
  }

  public void addCars(CarList cars)
  {

    var temp = getAllCars();

    for (int i = 0; i < cars.size(); i++)
    {
      temp.addCar(cars.getCar(i));
    }

    saveChanges(temp);
  }

  public void deleteCar(Car car)
  {
    var temp = getAllCars();
    //temp.removeCar(car);
    var temp2 = new CarList();
    for (int i = 0; i < temp.size(); i++)
    {
      if (!(temp.getCar(i).equals(car)))
        temp2.addCar(car);
    }

    //saveChanges(temp);
    saveChanges(temp2);
  }

  public void deleteCarByRegNumber(String regNumber)
  {
    var temp = getAllCars();

    temp.removeCar(temp.getCar(regNumber));

    saveChanges(temp);
  }
}
