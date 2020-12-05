import java.util.ArrayList;

public class Course
{
  private String title;
  private Instructor[] instructors;
  private ArrayList<Student> students;

  public Course(String title, Instructor primaryInstructor)
  {
    this.title = title;
    instructors = new Instructor[2];
    instructors[0] = primaryInstructor;
    students = new ArrayList<Student>();
  }
  public String getTitle()
  {
    return title;
  }
  public Instructor getPrimaryInstructor()
  {
    return instructors[0];
  }
  public Instructor getSecondaryInstructor()
  {
    if (instructors[1] != null)
      return instructors[1];
    return null;
  }
  public void setSecondaryInstructor(Instructor secondaryInstructor)
  {
    instructors[1] = secondaryInstructor;
  }
  public void addStudent(Student student)
  {
    students.add(student);
  }
  public int getNumberOfInstructors()
  {
    return instructors.length;
  }
  public int getNumberOfStudents()
  {
    return students.size();
  }
  public Student[] getStudentsBySemester(int semester)
  {
    ArrayList<Student> temp = new ArrayList<Student>();
    for (Student el : students)
    {
      if (el.getSemester() == semester)
      {
        temp.add(el);
      }
    }
    return temp.toArray(new Student[0]);
  }
  public boolean hasStudent(String name)
  {
    for (Student el : students)
    {
      if (el.getName().equals(name))
        return true;
    }
    return false;
  }
  public String toString()
  {
    String str = "The course " + title + " with instructors ";
    for (Instructor el : instructors)
    {
      str += el.getName() + " ";
    }
    str += "has the following students:\n";
    for (Student el : students)
    {
      str += el.getName() + "\n";
    }
    return str;
  }
}
