package PersonInheritace;

public class Student extends Person
{
  private String program;

  public Student(String name, String address, String program)
  {
    super(name, address);
    this.program = program;
  }

  public void setProgram(String program)
  {
    this.program = program;
  }

  public String getProgram()
  {
    return program;
  }

  public String toString()
  {
    return super.toString() + " enrolled in " + program + " program.";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Student))
      return false;

    var other = (Student)obj;

    return super.equals(other)
        && this.program.equals(other.program);
  }
}
