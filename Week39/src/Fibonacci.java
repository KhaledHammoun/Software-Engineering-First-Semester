public class Fibonacci
{
  public static void main(String[] args)
  {
    int firstNum = 0;
    int secondNum = 1;
    System.out.println("Fibonacci (0) = 1");

    for (int i = 1; i <= 20; i++)
    {
      int sum = firstNum+secondNum;
      System.out.println("Fibonacci (" + i + ") = " + sum);
      firstNum = secondNum;
      secondNum = sum;

    }
  }
}
