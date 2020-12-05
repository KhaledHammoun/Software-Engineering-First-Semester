import java.util.Scanner;

public class SumArrays
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int[] firstArray = new int[4];
    int[] secondArray = new int[4];
    int[] sumArray = new int[firstArray.length];

    for (int i = 0; i < firstArray.length; i++)
    {
      firstArray[i] = Integer.parseInt(scan.nextLine());
    }
    for (int i = 0; i < secondArray.length; i++)
    {
      secondArray[i] = Integer.parseInt(scan.nextLine());
    }

    for (int i = 0; i < firstArray.length; i++)
    {
      sumArray[i] = firstArray[i] + secondArray[i];
    }

    for (int el: sumArray)
    {
      System.out.println(el);
    }
  }
}
