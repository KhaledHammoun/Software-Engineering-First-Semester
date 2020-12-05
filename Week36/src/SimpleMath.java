import java.util.Scanner;

public class SimpleMath
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please type a number: ");
    double numberOne = keyboard.nextDouble();

    System.out.print("Please type a number: ");
    double numberTwo = keyboard.nextDouble();

    System.out.print("Please type a number: ");
    double numberThree = keyboard.nextDouble();

    double sumTotal = numberOne + numberTwo + numberThree;
    double productTotal = numberOne * numberTwo * numberThree;

    System.out.println("The sum of the numbers is: " + sumTotal);
    System.out.println("The product of the numbers is: " + productTotal);
  }
}
