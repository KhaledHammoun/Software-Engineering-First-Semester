public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public Date()
  {
    day = 1;
    month = 1;
    year = 2020;
  }
  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public Date copy()
  {
    return new Date(day, month, year);
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Date))
      return false;
    Date other = (Date)obj;
    return this.day==other.day
        && this.month == other.month
        && this. year == other.year;
  }
  public String toString()
  {
    return "day " + day + " month " + month + " year " +year;
  }
}
