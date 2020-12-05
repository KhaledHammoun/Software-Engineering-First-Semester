import java.util.Scanner;

public class ReverseString
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a string to reverse: ");
    String stringToReverse = scan.nextLine();
    String newString = "";

    for (int i = stringToReverse.length() - 1; i >= 0; i--)
    {
      newString += stringToReverse.charAt(i);
    }

    System.out.println(newString);
  }
}
