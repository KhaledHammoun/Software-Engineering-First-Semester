public class Job
{
  private String jobTitle;
  private double monthlySalary;
  private Person employee;

  public Job(String jobTitle, double monthlySalary, String name, String birthday)
  {
    this.jobTitle = jobTitle;
    this.monthlySalary = monthlySalary;
    this.employee = new Person(name, birthday);
  }

  public Job(String jobTitle, double monthlySalary)
  {
    this.jobTitle = jobTitle;
    this.monthlySalary = monthlySalary;
    this.employee = new Person();
  }

  public void setJobTitle(String jobTitle)
  {
    this.jobTitle = jobTitle;
  }

  public void setMonthlySalary(double monthlySalary)
  {
    this.monthlySalary = monthlySalary;
  }

  public void setEmployee(String name, String birthday)
  {
    employee.setName(name);
    employee.setBirthday(birthday);
  }

  public String getJobTitle()
  {
    return jobTitle;
  }

  public double getMonthlySalary()
  {
    return monthlySalary;
  }

  public Person getEmployee()
  {
    return employee;
  }

  public void givePercentageRaise(double percentage)
  {
    monthlySalary *= monthlySalary*percentage;
  }

  public String toString()
  {
    return "Job: " + jobTitle + "\nSalary: " + monthlySalary + "\nEmployee name: " +
            employee.getName() + "\nEmployee birthday: " + employee.getBirthday();
  }
}
