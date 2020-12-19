package VehicleInheritance;

public class Bicycle extends Vehicle
{
  private int gears;

  public Bicycle(String owner, double price, int gears)
  {
    super(owner, price);
    this.gears = gears;
  }

  public void setGears(int gears)
  {
    this.gears = gears;
  }

  public int getGears()
  {
    return gears;
  }

  public String toString()
  {
    return super.toString() + " with " + gears + " gears.";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Bicycle))
      return false;

    var other = (Bicycle)obj;

    return super.equals(other)
        && this.gears == other.gears;
  }
}
