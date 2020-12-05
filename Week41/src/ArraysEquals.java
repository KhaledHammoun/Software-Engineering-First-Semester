import java.util.Scanner;

public class ArraysEquals
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int[] firstArray = new int[4];
    int[] secondArray = new int[4];

    for (int i = 0; i < firstArray.length; i++)
    {
      System.out.println("Enter number: ");
      firstArray[i] = Integer.parseInt(scan.nextLine());
    }
    for (int i = 0; i < secondArray.length; i++)
    {
      System.out.println("Enter number: ");
      secondArray[i] = Integer.parseInt(scan.nextLine());
    }
    boolean isEqual = true;
    for (int i = 0; i < firstArray.length; i++)
    {
      if (firstArray[i] != secondArray[i])
      {
        isEqual = false;
        break;
      }
    }
    if (isEqual)
      System.out.println("They are equal!");
    else
      System.out.println("They are not equal!");
  }
}
