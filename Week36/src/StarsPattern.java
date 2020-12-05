import java.util.Scanner;

public class StarsPattern
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please provide number of rows to print: ");
    int rows = scanner.nextInt();
    System.out.println("\nThe star pattern is: ");
    for (int m = 1; m <= rows; m++)
    {
      for (int n = rows; n > m; n--)
      {
        System.out.print(" ");
      }
      for (int p = 1; p <= (m * 2) - 1; p++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int m = rows - 1; m >= 1; m--)
    {
      for (int n = rows - 1; n >= m; n--)
      {
        System.out.print(" ");
      }
      for (int p = 1; p <= (m * 2) - 1; p++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
