public class LandTractTest
{
  public static void main(String[] args)
  {
    LandTract first = new LandTract(3,4);
    LandTract second = new LandTract(3,4);

    System.out.println("First land area = " + first + "sqrM" +
                       " and second land area = " + second + "sqrM"+ " and the lands are " +
                      (first.equals(second) ? "equal" : "not equal") + " in size.");
  }
}
