import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberUpdated
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    int randomNumber = random.nextInt(1000);
    System.out.print("Enter your best guess: ");
    int number = scan.nextInt();

    while (randomNumber != number)
    {
      if (number < randomNumber)
      {
        System.out.println("Number too less, try again.");
      }
      else if (number > randomNumber)
      {
        System.out.println("Number too big, try again.");
      }

      System.out.print("Enter your best guess: ");
      number = scan.nextInt();
    }

    System.out.println("Great job!");
  }
}
