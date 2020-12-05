public class Student
{
  private String name;
  private int semester;

  public Student(String name, int semester)
  {
    this.name = name;
    this.semester = semester;
  }
  public String getName()
  {
    return name;
  }
  public int getSemester()
  {
    return semester;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Student))
      return false;
    Student other = (Student)obj;
    return this.name.equals(other.name)
        && this.semester == other.semester;
  }
  public String toString()
  {
    return "Student " + name + " in semester number " + semester;
  }
}
