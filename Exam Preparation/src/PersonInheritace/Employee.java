package PersonInheritace;

public class Employee extends Person
{
  private int employeeNumber;

  public Employee(String name, String address, int employeeNumber)
  {
    super(name, address);
    this.employeeNumber = employeeNumber;
  }

  public void setEmployeeNumber(int employeeNumber)
  {
    this.employeeNumber = employeeNumber;
  }

  public int getEmployeeNumber()
  {
    return employeeNumber;
  }

  public String toString()
  {
    return super.toString() + " employee ID No: " + employeeNumber;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Employee))
      return false;

    var other = (Employee)obj;

    return super.equals(other)
        && this.employeeNumber == other.employeeNumber;
  }
}
