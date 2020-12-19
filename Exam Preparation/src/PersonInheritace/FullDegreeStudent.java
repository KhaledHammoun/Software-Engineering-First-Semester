package PersonInheritace;

public class FullDegreeStudent extends Student
{
  private int semester;

  public FullDegreeStudent(String name, String address, String program, int semester)
  {
    super(name, address, program);
    this.semester = semester;
  }

  public void setSemester(int semester)
  {
    this.semester = semester;
  }

  public int getSemester()
  {
    return semester;
  }

  public String toString()
  {
    return super.toString() + " in the " + semester + " semester.";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof FullDegreeStudent))
      return false;

    var other = (FullDegreeStudent)obj;

    return super.equals(other)
        && this.semester == other.semester;
  }
}
