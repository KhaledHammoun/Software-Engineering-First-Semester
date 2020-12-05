import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentClassTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    List<Student> students = new ArrayList<Student>();
    System.out.print("Enter student: ");
    String input = keyboard.nextLine();

    while (!input.equals("End"))
    {
      String[] tokens = input.split(", ");
      Student student = new Student(tokens[0], tokens[1].charAt(0), Integer.parseInt(tokens[2]));
      students.add(student);

      System.out.print("Enter student: ");
      input = keyboard.nextLine();
    }

    for (Student student : students)
    {
      System.out.println(student);
    }
  }
}
