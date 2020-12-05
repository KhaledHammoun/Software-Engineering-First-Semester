public class Rainfall
{
  double[] rainfall = new double[12];

  public Rainfall(double[] num)
  {
    for (int i = 0; i < rainfall.length; i++)
    {
      rainfall[i] = num[i];
    }
  }
  public Rainfall()
  {
    rainfall = new double[12];
  }
  public double totalRainfall()
  {
    double total = 0;
    for (double el : rainfall)
    {
      total += el;
    }
    return total;
  }

  public double averageMonthlyRainfall()
  {
    return this.totalRainfall() / rainfall.length;
  }

  public String monthWithMostRain()
  {
    int month = 0;
    double maxRain = rainfall[0];
    for (int i = 0; i < rainfall.length; i++)
    {
      if (maxRain < rainfall[i])
      {
        maxRain = rainfall[i];
        month = i;
      }
    }
    return monthName(month);
  }
  public String monthWithLeastRain()
  {
    int month = 0;
    double minRain = rainfall[0];
    for (int i = 0; i < rainfall.length; i++)
    {
      if (minRain > rainfall[i])
      {
        minRain = rainfall[i];
        month = i;
      }
    }
    return monthName(month);
  }
  public String monthName(int month)
  {
    String monthName = "";

    switch (month)
    {
      case 0:
        monthName = "January";
        break;
      case 1:
        monthName = "February";
        break;
      case 2:
        monthName = "March";
        break;
      case 3:
        monthName = "April";
        break;
      case 4:
        monthName = "May";
        break;
      case 5:
        monthName = "June";
        break;
      case 6:
        monthName = "July";
        break;
      case 7:
        monthName = "August";
        break;
      case 8:
        monthName = "September";
        break;
      case 9:
        monthName = "October";
        break;
      case 10:
        monthName = "November";
        break;
      case 11:
        monthName = "December";
        break;
      default:
        monthName = "Invalid!";
        break;
    }
    return monthName;
  }
}
