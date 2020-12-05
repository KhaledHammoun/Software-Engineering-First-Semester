public class GolfArrays
{
  public static void main(String[] args)
  {
    int[] golfHols = {3, 5, 1, 3, 3, 2, 4, 2, 3};

    int totalHits = 0;
    int totalOnes = 0;

    for (int el : golfHols)
    {
      totalHits += el;
      if (el == 1)
      {
        totalOnes++;
      }
    }

    double average = (double)totalHits / golfHols.length;

    System.out.println("Total number of hits: " + totalHits);
    System.out.println("Average hits per hole: " + average);
    System.out.println("Total ones hits: " + totalOnes);
  }
}
