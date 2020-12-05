public class Payroll
{
  private String employeeName;
  private double hourlyPayRate;
  private double hoursWorked;

  public Payroll()
  {
    employeeName = "";
    hoursWorked = 0;
    hourlyPayRate = 0;
  }

  public Payroll(String employeeName, double hourlyPayRate, double hoursWorked)
  {
    this.employeeName = employeeName;
    this.hourlyPayRate = hourlyPayRate;
    this.hoursWorked = hoursWorked;
  }
  public void setName(String addName)
  {
    employeeName = addName;
  }

  public void setHourlyPayRate(double addPayRate)
  {
    hourlyPayRate = addPayRate;
  }

  public void setHoursWorked(double addHoursWorked)
  {
    hoursWorked = addHoursWorked;
  }

  public String getEmployeeName()
  {
    return employeeName;
  }

  public double getHourlyPayRate()
  {
    return hourlyPayRate;
  }

  public double getHoursWorked()
  {
    return hoursWorked;
  }

  public double employeesGrossPay()
  {
    return hourlyPayRate * hoursWorked;
  }

  public String toString()
  {
    return "Employee " + employeeName + " has a gross pay of " + employeesGrossPay() + "$";
  }
}
