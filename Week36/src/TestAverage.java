import java.util.Scanner;

public class TestAverage
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter first score: ");
    double firstScore = keyboard.nextDouble();

    System.out.print("Enter second score: ");
    double secondScore = keyboard.nextDouble();

    System.out.print("Enter third score: ");
    double thirdScore = keyboard.nextDouble();

    double averageScore = (firstScore + secondScore + thirdScore) /3;

    System.out.println("First score: " + firstScore);
    System.out.println("Second score: " + secondScore);
    System.out.println("Third score: " + thirdScore);
    System.out.println("Average score is " + averageScore);
  }
}
