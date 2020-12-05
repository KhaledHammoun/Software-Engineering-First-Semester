import java.util.ArrayList;

public class GradeList
{
  private ArrayList<Grade> grades;

  public GradeList()
  {
    grades = new ArrayList<Grade>();
  }

  public int getNumberOfGrades()
  {
    return grades.size();
  }

  public ArrayList<Grade> getAllGrades()
  {
    return grades;
  }

  public Grade[] getAllGradesAsArray()
  {
    return grades.toArray(new Grade[0]);
  }

  public void addGrade(Grade grade)
  {
    grades.add(grade);
  }

  public double getAverage()
  {
    double sum = 0;
    for (Grade el : grades)
    {
      sum += el.getGrade();
    }
    return sum / grades.size();
  }

  public String toString()
  {
    String str = "";
    for (Grade el : grades)
    {
      str += el.getGrade() + " ";
    }
    return str;
  }
}
