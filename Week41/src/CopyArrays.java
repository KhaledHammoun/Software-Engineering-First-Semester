public class CopyArrays
{
  public static void main(String[] args)
  {
    int[] sourceArray = {1, 2, 3, 4, 5};
    int[] destinationArray = new int[sourceArray.length];

    for (int i = 0; i < sourceArray.length; i++)
    {
      destinationArray[i] = sourceArray[i];
    }
    for (int i = 0; i< sourceArray.length; i++)
    {
      System.out.println("sourceArray: " + sourceArray[i] + " destinationArray: " + destinationArray[i]);
    }
  }
}
