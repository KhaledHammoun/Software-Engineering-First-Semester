public class RainfallClassTest
{
  public static void main(String[] args)
  {
    double[] rain =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    Rainfall rainfall = new Rainfall(rain);

    System.out.println(rainfall.totalRainfall());
    System.out.println(rainfall.monthWithLeastRain());
    System.out.println(rainfall.averageMonthlyRainfall());
    System.out.println(rainfall.monthWithMostRain());
  }
}
