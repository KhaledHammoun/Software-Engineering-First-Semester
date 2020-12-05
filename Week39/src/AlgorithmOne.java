import java.util.Scanner;

public class AlgorithmOne
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = Integer.parseInt(scan.nextLine());
    int product = 0;
    int sum = number;
    while (product < 100)
    {
      sum *= 10;
      if (sum >= 100)
      {
        break;
      }
      else
        product = sum;

    }

    System.out.println(product);
  }
}
