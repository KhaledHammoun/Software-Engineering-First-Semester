public class ForLoopGame
{
  public static void main(String[] args)
  {
    double sum = 0;
    int j = 30;
    for (int i = 1; i <= 30; i++)
    {
        sum += (i*1.0/j--);
    }
    System.out.print(sum);
  }
}
