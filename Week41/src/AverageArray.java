import java.util.Scanner;

public class AverageArray
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int[] intArr = new int[5];
    for (int i = 0; i < intArr.length; i++)
    {
      intArr[i] = scan.nextInt();
    }
    int total = 0;
    double average = 0;
    for (int i = 0; i < intArr.length; i++)
    {
      total += intArr[i];
    }
    average = (double)total / intArr.length;

    System.out.println(average);
  }
}
