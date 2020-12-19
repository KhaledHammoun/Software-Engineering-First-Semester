package PersonInheritace;

public class ExchangeStudent extends Student
{
  private String fromCountry;

  public ExchangeStudent(String name, String address, String program, String fromCountry)
  {
    super(name, address, program);
    this.fromCountry = fromCountry;
  }

  public void setFromCountry(String fromCountry)
  {
    this.fromCountry = fromCountry;
  }

  public String getFromCountry()
  {
    return fromCountry;
  }

  public String toString()
  {
    return super.toString() + " exchange student from " + fromCountry + ".";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ExchangeStudent))
      return false;

    var other = (ExchangeStudent)obj;

    return super.equals(other)
        && this.fromCountry.equals(other.fromCountry);
  }
}
