public class WiseVSKind
{
  public static void main(String[] args)
  {
    double totalWheat = 0;
    double currentWheat = 0;

    for (int i = 0; i < 8; i++)
    {
      for (int j = 0; j < 8; j++)
      {
        if (currentWheat == 0 || currentWheat == 1)
        {
          currentWheat++;
          totalWheat += currentWheat;
          continue;
        }
        currentWheat *= 2;
        totalWheat += currentWheat;
      }
    }
    System.out.println("Last square contains: " + currentWheat);
    System.out.println("Total reward: " + totalWheat);
  }
}

