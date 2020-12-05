public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList grades = new GradeList(4);
    Grade firstGrade = new Grade("SDJ", 7);
    Grade secondGrade = new Grade("MSE", 2);
    Grade thirdGrade = new Grade("RWD", 4);

    grades.setGrade(firstGrade, 0);
    grades.setGrade(secondGrade, 1);
    grades.setGrade(thirdGrade, 2);

    System.out.println("Average: " + grades.getAverage());
    System.out.println("Grade at index 3: " + grades.getGrade(3));
    System.out.println(grades);
  }
}
