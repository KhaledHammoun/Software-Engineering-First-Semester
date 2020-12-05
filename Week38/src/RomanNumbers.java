import java.util.Scanner;

public class RomanNumbers
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Please, enter a number from 1 to 10 or \"End\": ");
    String num = scan.nextLine();
    String message;

    while (!num.equals("End"))
    {
      switch (num)
      {
        case "1":
          message = "\u2160";
          break;
        case "2":
          message = "\u2161";
          break;
        case "3":
          message = "\u2162";
          break;
        case "4":
          message = "\u2163";
          break;
        case "5":
          message = "\u2164";
          break;
        case "6":
          message = "\u2165";
          break;
        case "7":
          message = "\u2166";
          break;
        case "8":
          message = "\u2167";
          break;
        case "9":
          message = "\u2168";
          break;
        case "10":
          message = "\u2169";
          break;
        default:
          message = "Invalid input!";
          break;
      }
      System.out.println(message);

      System.out.print("Please, enter a number from 1 to 10 or \"End\": ");
      num = scan.nextLine();

    }
  }
}
