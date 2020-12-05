public class ArraysDoubleValues
{
  public static void main(String[] args)
  {
    int[] firstArr = {4, 2, 12, 56, 23, 13};
    for (int i = 0; i < firstArr.length; i++)
    {
      firstArr[i] *= 2;
    }
    for (int el : firstArr)
    {
      System.out.println(el);
    }
  }
}
