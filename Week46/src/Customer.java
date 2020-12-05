public abstract class Customer
{
  private String name;
  private String address;

  public Customer(String name, String address)
  {
    this.name = name;
    this.address = address;
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Customer))
      return false;

    Customer other = (Customer)obj;
    return this.name.equals(other.name)
        && this.address.equals(other.address);
  }
  public String toString()
  {
    return "Customer " + name + " with address: " + address;
  }
  public abstract String getType();
}
