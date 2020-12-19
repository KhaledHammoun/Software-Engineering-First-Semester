package PersonInheritace;

public class HeadOfDepartment extends Employee
{
  private String department;

  public HeadOfDepartment(String name, String address, int employeeNumber, String department)
  {
    super(name, address, employeeNumber);
    this.department = department;
  }

  public void setDepartment(String department)
  {
    this.department = department;
  }

  public String getDepartment()
  {
    return department;
  }

  public String toString()
  {
    return super.toString() + " head of " + department + " department.";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof HeadOfDepartment))
      return false;

    var other = (HeadOfDepartment)obj;

    return super.equals(other)
        && this.department.equals(other.department);
  }
}
