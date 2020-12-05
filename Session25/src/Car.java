import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable
{
  private String regNumber;
  private String make;
  private String model;
  private int year;
  private Owner owner;

  public Car(String regNumber, String make, String model, int year, Owner owner)
  {
    this.regNumber = regNumber;
    this.make = make;
    this.model = model;
    this.year = year;
    this.owner = owner;
  }

  public String getRegNumber()
  {
    return regNumber;
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public int getYear()
  {
    return year;
  }

  public Owner getOwner()
  {
    return owner;
  }

  public String toString()
  {
    return "Car with registration number " + regNumber
        + " make " + make + " model " + model + " from " + year
        + owner;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Car))
      return false;

    Car car = (Car) obj;
    return this.year == car.year
        && this.regNumber.equals(car.regNumber)
        && this.make.equals(car.make)
        && this.model.equals(car.model)
        && this.owner.equals(car.owner);
  }
}
