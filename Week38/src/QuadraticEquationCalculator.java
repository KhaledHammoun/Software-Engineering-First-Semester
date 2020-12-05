import java.util.Scanner;

public class QuadraticEquationCalculator
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double solution;
    double solutionTwo;
    System.out.print("Enter value for \"a\": ");
    double a = scan.nextDouble();
    System.out.print("Enter value for \"b\": ");
    double b = scan.nextDouble();
    System.out.print("Enter value for \"c\": ");
    double c = scan.nextDouble();

    double determinant = Math.pow(b, 2) - 4 * a * c;
    double result;
    if (determinant < 0)
    {
      System.out.println("There is no solution");
    }
    else if (determinant == 0)
    {
      solution = - b / 2*a;
      System.out.println(solution);
    }
    else
    {
      solution = - b + Math.sqrt(determinant) / 2*a;
      solutionTwo = - b - Math.sqrt(determinant) / 2*a;
      System.out.println(solution);
      System.out.println(solutionTwo);
    }


  }
}
