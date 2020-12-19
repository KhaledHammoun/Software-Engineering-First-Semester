package PersonInheritace;

public class Person
{
  private String name;
  private String address;

  public Person(String name, String address)
  {
    this.name = name;
    this.address = address;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public String getAddress()
  {
    return address;
  }

  public String toString()
  {
    return "Name: " + name + " address: " + address;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
      return false;

    var other = (Person)obj;

    return this.name.equals(other.name)
        && this.address.equals(other.address);
  }
}

