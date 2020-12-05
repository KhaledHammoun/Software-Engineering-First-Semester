import java.util.Scanner;

public class GradesConverter
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String convertedGrade = "";
    System.out.print("Please, enter grade: ");
    String input = scan.nextLine();

    while (!input.equals("End"))
    {
      switch (input)
      {
        case "12":
          convertedGrade = "A";
          break;
        case "10":
          convertedGrade = "B";
          break;
        case "7":
          convertedGrade = "C";
          break;
        case "4":
          convertedGrade = "D";
          break;
        case "2":
          convertedGrade = "E";
          break;
        case "0":
          convertedGrade = "Fx";
          break;
        case "-3":
          convertedGrade = "F";
          break;
        default:
          convertedGrade = "Enter valid grade!";
          break;
      }

      System.out.println(convertedGrade);

      System.out.print("Please, enter grade: ");
      input = scan.nextLine();
    }

  }
}
