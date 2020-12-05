import java.util.Scanner;

public class AgeGrouping
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter age: ");
    String input = scan.nextLine();
    String message = "";

    while (!input.equals("End"))
    {
      int age = Integer.parseInt(input);

      if (age < 0)
      {
        message = "Error in age value";
      }
      else if (age <= 12)
      {
        message = "Child";
      }
      else if (age <= 19)
      {
        message = "Teenager";
      }
      else if (age <= 65)
      {
        message = "Adult";
      }
      else
      {
        message = "Senior citizen";
      }
      System.out.println(message);
      System.out.print("Enter age: ");
      input = scan.nextLine();
    }
  }
}
