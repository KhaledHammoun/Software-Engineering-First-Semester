package VehicleInheritance;

public class Car extends Vehicle
{
  private String regNo;

  public Car(String owner, double price, String regNo)
  {
    super(owner, price);
    this.regNo = regNo;
  }

  public void setRegNo(String regNo)
  {
    this.regNo = regNo;
  }

  public String getRegNo()
  {
    return regNo;
  }

  public String toString()
  {
    return super.toString() + " with registration number: " + regNo;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Car))
      return false;

    var other = (Car)obj;

    return super.equals(other)
        && this.regNo.equals(other.regNo);
  }
}
