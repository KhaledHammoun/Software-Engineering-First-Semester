public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList grades = new GradeList();

    Grade firstGrade = new Grade("SDJ", 7);
    Grade secondGrade = new Grade("RWD", 2);
    Grade thirdGrade = new Grade("MSE", 4);
    Grade fourthGrade = new Grade("SEP", 0);

    grades.addGrade(firstGrade);
    grades.addGrade(secondGrade);
    grades.addGrade(thirdGrade);
    grades.addGrade(fourthGrade);

    System.out.println(grades.getNumberOfGrades());
    Grade[] test = grades.getAllGradesAsArray();
    for (Grade el : test)
    {
      System.out.println(el);
    }
    System.out.println(grades.getAverage());
  }
}
