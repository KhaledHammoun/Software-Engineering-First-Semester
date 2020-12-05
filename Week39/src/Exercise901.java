import java.util.Scanner;

public interface Exercise901
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int number = Integer.parseInt(scan.nextLine());

    for (int i = 1; i <= number; i++)
    {
      System.out.print(i + " ");
    }
    System.out.println();
    for (int i = 2; i <= number; i*=2)
    {
      System.out.print(i + " ");
    }
    System.out.println();
    for (int i = 1; i <= number; i++)
    {
      System.out.print((int)Math.pow(i, 2) + " ");
    }
  }
}
