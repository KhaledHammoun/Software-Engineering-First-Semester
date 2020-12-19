package VehicleInheritance;

public class Vehicle
{
  private String owner;
  private double price;

  public Vehicle(String owner, double price)
  {
    this.owner = owner;
    this.price = price;
  }

  public void setOwner(String owner)
  {
    this.owner = owner;
  }

  public String getOwner()
  {
    return owner;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public double getPrice()
  {
    return price;
  }

  public String toString()
  {
    return "Owner: " + owner + " Price: " + price;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Vehicle))
      return false;

    var other = (Vehicle)obj;

    return this.owner.equals(other.owner)
        && this.price == other.price;
  }
}
