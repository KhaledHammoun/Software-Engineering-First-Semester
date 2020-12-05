public class Assignment2c
{
  public static void main(String[] args)
  {
    int result = 0;

    for (int i = 0; i < 10; i++)
    {
      for (int j = i; j < 10; j++)
      {
        for (int k = j; k < 10; k++)
        {
          result++;
        }
      }
    }
    System.out.println(result);
  }
}
