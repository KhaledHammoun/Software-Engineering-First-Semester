import java.util.Scanner;

public class RandomProg
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int negativeSum = 0;
    int positiveSum = 0;

    int x = Integer.parseInt(scan.nextLine());

    while (x != 0)
    {
      if (x > 0)
      {
        positiveSum += x;
      }
      else
      {
        negativeSum += x;
      }
      x = Integer.parseInt(scan.nextLine());
    }
    System.out.println(positiveSum);
    System.out.println(negativeSum);
  }
}
