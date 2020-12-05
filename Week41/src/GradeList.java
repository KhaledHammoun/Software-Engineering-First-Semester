//import java.util.Scanner;

public class GradeList
{
  private Grade[] grades;

  public GradeList(int numberOfGrades)
  {
    //Scanner scan = new Scanner(System.in);
    grades = new Grade[numberOfGrades];

    /*for (int i = 0; i < numberOfGrades; i++)
    {
      grades[i] = -1;
      //System.out.print("Enter grade " + (i+1) + ": ");
      //grades[i] = Integer.parseInt(scan.nextLine());
      //System.out.println();
    }*/
  }
  public int getNumberOfGrades()
  {
    return grades.length;
  }
  public Grade getGrade(int index)
  {
    return grades[index];
  }
  public void setGrade(Grade grade, int index)
  {
    grades[index] = grade;
  }
  public double getAverage()
  {
    int total = 0;
    int numOfGrades = 0;
    for (Grade el : grades)
    {
      if (el != null)
      {
        total += el.getGrade();
        numOfGrades++;
      }
    }
    return (double)total / numOfGrades;
  }
  public String toString()
  {
    StringBuilder arr = new StringBuilder();
    for (Grade el : grades)
    {
      if (el == null)
      {
        arr.append("Empty\n");
      }
      else
      {
        arr.append(el);
        arr.append("\n");
      }
    }
    return arr.toString();
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof GradeList))
    {
      return false;
    }
    GradeList other = (GradeList)obj;
    if (other.grades.length != this.grades.length)
    {
      return false;
    }
    for (int i = 0; i < grades.length; i++)
    {
      if (!this.grades[i].equals(other.grades[i]))
      {
        return false;
      }
    }
    return true;
  }
}
