import java.util.Scanner;

public class ExceptionExercise
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter x: ");
    int x = scanner.nextInt();
    System.out.println("Enter y: ");
    int y = scanner.nextInt();
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    try
    {
      System.out.println("x / y = " + (x / y));
    }
    catch (java.lang.ArithmeticException e)
    {
      throw new java.lang.ArithmeticException("Cant divide by 0");
    }
    finally
    {
      System.out.println("x * y = " + (x * y));
    }

  }

}
