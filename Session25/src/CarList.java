import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
  private ArrayList<Car> cars;

  public CarList()
  {
    cars = new ArrayList<Car>();
  }

  public int size()
  {
    return cars.size();
  }

  public int indexOfRegNumber(String regNumber)
  {
    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.get(i).getRegNumber().equals(regNumber))
        return i;
    }
    return -1;
  }

  public Car getCar(int index)
  {
    if (index< 0 || index >= cars.size())
      return null;

    return cars.get(index);
  }

  public void removeCar(Car car)
  {
    cars.remove(car);
  }

  public Car getCar(String regNumber)
  {
    for (Car car : cars)
    {
      if (car.getRegNumber().equals(regNumber))
        return car;
    }
    return null;
  }

  public void addCar(Car car)
  {
    if (getCar(car.getRegNumber())==null)
      cars.add(car);
  }

  public String toString()
  {
    StringBuilder temp = new StringBuilder();

    for (Car car : cars)
    {
      temp.append(car).append("\n");
    }

    return temp.toString();
  }
}
