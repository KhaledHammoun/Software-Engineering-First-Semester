public class MyDate
{
  private int day;
  private int month;
  private int year;

  public void setDay(int aDay)
  {
    day = aDay;
  }

  public void setMonth(int aMonth)
  {
    month = aMonth;
  }

  public void setYear(int aYear)
  {
    year = aYear;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public String toString()
  {
    return day+"/"+month+"/"+year;
  }

}