import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class GenderAndAge
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String message = "";
    System.out
        .print("Please, enter gender as M or F and age separated by \", \": ");
    String input = scan.nextLine();
    //char gender = scan.nextLine().charAt(0);

    //System.out.print("Please, enter age: ");
    //int age = scan.nextInt();
    while (!input.equals("End"))
    {
      String[] tokens = input.split(", ");
      char gender = tokens[0].charAt(0);
      int age = Integer.parseInt(tokens[1]);

      if ((gender != 'M' || gender != 'F') && age < 0)
      {
        message = "Error in typed values";
      }
      else if (gender == 'M' && age < 18)
      {
        message = "Boy";
      }
      else if (gender == 'M' && age >= 18)
      {
        message = "Man";
      }
      else if (gender == 'F' && age < 18)
      {
        message = "Girl";
      }
      else if (gender == 'F' && age >= 18)
      {
        message = "Woman";
      }

      System.out.println(message);

      System.out
          .print("Please, enter gender as M or F and age separated by \", \": ");
      input = scan.nextLine();
    }
  }
}
