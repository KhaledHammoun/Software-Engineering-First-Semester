public class Employee
{
  private String name;
  private int idNumber;
  private String department;
  private String position;

  public Employee()
  {
    name = "";
    idNumber = 0;
    position = "";
    department = "";
  }
  public Employee(String name, int idNumber, String department, String position)
  {
    this.name = name;
    this.idNumber = idNumber;
    this.department = department;
    this.position = position;
  }

  public void setName(String addName)
  {
    name = addName;
  }

  public void setIdNumber(int idNumber)
  {
    this.idNumber = idNumber;
  }

  public void setDepartment(String department)
  {
    this.department = department;
  }

  public void setPosition(String position)
  {
    this.position = position;
  }

  public String getName()
  {
    return name;
  }

  public int getIdNumber()
  {
    return idNumber;
  }

  public String getDepartment()
  {
    return department;
  }

  public String getPosition()
  {
    return position;
  }

  public String toString()
  {
    return "Employee data:\n\t" +
            name +"\n\t" +
            idNumber + "\n\t" +
            department + "\n\t" +
            position;
  }
}
