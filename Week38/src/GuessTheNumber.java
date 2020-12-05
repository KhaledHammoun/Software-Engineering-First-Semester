import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Random random = new Random(10);

    System.out.print("Please, enter your best guess from 1 to 10: ");
    int guess = Integer.parseInt(scan.nextLine());

    int number = random.nextInt() + 1;

    System.out.println(guess == number ? "Correct!" : "Wrong");
  }
}
