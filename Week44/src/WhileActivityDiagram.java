import java.util.Scanner;

public class WhileActivityDiagram
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int sum = 0;
    int count = 0;

    while(sum < 20 && count < 10)
    {
      int value = Integer.parseInt(scan.nextLine());
      sum += value;
      count++;

    }

    if (sum < 20)
    {
      System.out.println(count);
    }
    System.out.println(sum);
  }
}
