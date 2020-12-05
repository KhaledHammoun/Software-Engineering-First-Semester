public class Person extends Customer
{
  private int ssn;

  public Person(String name, String address, int ssn)
  {
    super(name, address);
    this.ssn = ssn;
  }
  public int getSsn()
  {
    return ssn;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
      return false;

    var other = (Person)obj;
    return super.equals(other) && this.ssn == other.ssn;
  }
  public String toString()
  {
    return super.toString() + " the persons ssn is: " + ssn;
  }
  public String getType()
  {
    return "personal";
  }
}
