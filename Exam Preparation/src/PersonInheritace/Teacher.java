package PersonInheritace;

public class Teacher extends Employee
{
  private String subject;

  public Teacher(String name, String address, int employeeNumber, String subject)
  {
    super(name, address, employeeNumber);
    this.subject = subject;
  }

  public void setSubject(String subject)
  {
    this.subject = subject;
  }

  public String getSubject()
  {
    return subject;
  }

  public String toString()
  {
    return super.toString() + " teaches " + subject;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Teacher))
      return false;

    var other = (Teacher)obj;

    return super.equals(other)
        && this.subject.equals(other.subject);
  }
}
