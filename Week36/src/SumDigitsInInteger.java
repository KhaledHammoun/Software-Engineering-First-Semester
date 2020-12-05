import java.util.Scanner;

public class SumDigitsInInteger
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = keyboard.nextInt();
    int numberToAdd;
    int total = 0;
    int rotations = String.valueOf(number).length();

    for (int i = 0; i <= rotations; i++)
    {
      numberToAdd = number % 10;
      total += numberToAdd;
      number /= 10;
    }

    System.out.println("The outcome is " + total);
  }
}
