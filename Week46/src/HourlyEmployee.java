public class HourlyEmployee extends Employee
{
  private double wagePerHour;
  private double hoursWorkedPerWeek;

  public HourlyEmployee(String name, Date birthday, double wagePerHour,
      double hoursWorkedPerWeek)
  {
    super(name, birthday);
    this.wagePerHour = wagePerHour;
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
  }

  public void setWagePerHour(double wagePerHour)
  {
    this.wagePerHour = wagePerHour;
  }

  public double getWagePerHour()
  {
    return wagePerHour;
  }

  public void setHoursWorkedPerWeek(double hoursWorkedPerWeek)
  {
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
  }

  public double getHoursWorkedPerWeek()
  {
    return hoursWorkedPerWeek;
  }

  public double earningsPerWeek()
  {
    return hoursWorkedPerWeek * wagePerHour;
  }

  public String toString()
  {
    return super.toString() + " has earned " + earningsPerWeek();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof HourlyEmployee))
      return false;

    HourlyEmployee other = (HourlyEmployee)obj;
    return super.equals(other) && this.wagePerHour == other.wagePerHour
        && this.hoursWorkedPerWeek == other.hoursWorkedPerWeek;
  }
}
