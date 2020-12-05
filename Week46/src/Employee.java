public abstract class Employee
{
  private String name;
  private Date birthday;

  public Employee(String name, Date birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public Date getBirthday()
  {
    return birthday.copy();
  }
  public String toString()
  {
    return "Employee "  + name+ " is born on " + birthday;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Employee))
      return false;

    Employee other = (Employee)obj;
    return this.name.equals(other.name)
        && this.birthday.equals(other.birthday);
  }
  public abstract double earningsPerWeek();
}

