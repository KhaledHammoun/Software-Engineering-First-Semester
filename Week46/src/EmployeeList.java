import java.util.ArrayList;

public class EmployeeList
{
  private int size;
  private ArrayList<Employee> employees;

  public EmployeeList(int maxNumberOfEmployees)
  {
    size = maxNumberOfEmployees;
    employees = new ArrayList<Employee>();
  }
  public void addEmployee(Employee employee)
  {
    if (employees.size() < size)
      employees.add(employee);
  }
  public void removeEmployee(Employee employee)
  {
    employees.remove(employee);
  }
  public int getNumberOfEmployees()
  {
    //return employees.size();
    int counter = 0;
    for (Employee el : employees)
    {
      if (el != null)
        counter++;
    }
    return counter;
  }
  public Employee[] getAllEmployees()
  {
    ArrayList<Employee> temp = new ArrayList<Employee>();
    for (Employee el : employees)
    {
      if (el != null)
        temp.add(el);
    }
    return temp.toArray(new Employee[0]);
  }
  public double getTotalEarningsPerWeek()
  {
    double total = 0;
    for (Employee el : employees)
    {
      total += el.earningsPerWeek();
    }
    return total;
  }
  public String toString()
  {
    StringBuilder stringBuilder = new StringBuilder();
    for (Employee el : employees)
    {
      stringBuilder.append(el).append("\n");
    }
    return stringBuilder.toString();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof EmployeeList))
      return false;

    EmployeeList other = (EmployeeList)obj;
    return this.size == other.size
        && this.employees.equals(other.employees);
  }
}
