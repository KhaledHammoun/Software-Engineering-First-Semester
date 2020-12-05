import jdk.jshell.ImportSnippet;

public class Instructor
{
  private String name;
  private int officeNumber;

  public Instructor(String name, int officeNumber)
  {
    this.name = name;
    this.officeNumber = officeNumber;
  }
  public String getName()
  {
    return name;
  }
  public int getOfficeNumber()
  {
    return officeNumber;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Instructor))
      return false;
    Instructor other = (Instructor)obj;
    return this.name.equals(other.name)
        && this.officeNumber == other.officeNumber;
  }
  public String toString()
  {
    return "Instructor " + name + " working in office number "+ officeNumber;
  }
}
