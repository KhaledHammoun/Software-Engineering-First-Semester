import java.util.Scanner;

public class SumNumbers
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter non 0 positive number: ");
    int number = Integer.parseInt(scan.nextLine());
    double sum = 0;

    for (int i = 1; i <= number; i++)
    {
      sum += i;
    }

    System.out.print(sum);
  }
}
