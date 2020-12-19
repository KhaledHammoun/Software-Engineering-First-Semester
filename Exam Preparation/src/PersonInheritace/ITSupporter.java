package PersonInheritace;

public class ITSupporter extends Employee
{
  private String shift;

  public ITSupporter(String name, String address, int employeeNumber, String shift)
  {
    super(name, address, employeeNumber);
    this.shift = shift;
  }

  public void setShift(String shift)
  {
    this.shift = shift;
  }

  public String getShift()
  {
    return shift;
  }

  public String toString()
  {
    return super.toString() + " responsible for " + shift + " shift.";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ITSupporter))
      return false;

    var other = (ITSupporter)obj;

    return super.equals(other)
        && this.shift.equals(other.shift);
  }
}
