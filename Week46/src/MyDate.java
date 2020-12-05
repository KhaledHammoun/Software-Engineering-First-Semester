import java.util.GregorianCalendar;

public class MyDate
{
  private int day;
  private int month;
  private int year;
  static GregorianCalendar todayDate = new GregorianCalendar();

  public MyDate(int day, int month, int year)
  {
    if (day > this.daysInMonth() || day < 1 && month > 12 || month < 1 && year < 1)
    {
      throw new IllegalDateException("Try again.");
    }
    this.day = day;
    this.month = month;
    this.year = year;

  }
  public MyDate()
  {
    this.day = todayDate.get(GregorianCalendar.DATE);
    this.month = todayDate.get(GregorianCalendar.MONTH)+1;
    this.year = todayDate.get(GregorianCalendar.YEAR);
  }
  public MyDate(MyDate secondDate)
  {
    day = secondDate.day;
    month = secondDate.month;
    year = secondDate.year;
  }

  public void setDay(int aDay)
  {
    if (daysInMonth() < aDay || aDay < 1)
    {
      throw new IllegalDateException("Wrong day");
    }
    day = aDay;
  }
  public void setMonth(int aMonth)
  {
    if (aMonth < 1 || aMonth > 12)
    {
      throw new IllegalDateException("Non existing month.");
    }
    month = aMonth;
  }
  public void setYear(int aYear)
  {
    if (aYear < 1)
    {
      throw new IllegalDateException("Non existing year.");
    }
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
  public void displayDate()
  {
    System.out.println(String.format("%s/%s/%s", day, month, year));
  }
  public boolean isLeapYear()
  {
    if (year % 4 == 0)
    {
      if (year % 100 == 0)
      {
        if (year % 400 == 0)
          return true;
        else
          return false;
      }
      else
      {
        return true;
      }
    }
    else
    {
      return false;
    }
  }
  public int daysInMonth()
  {
    int message = 0;
    switch (this.month)
    {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        message = 31;
        break;
      case 2:
        if (isLeapYear())
        {
          message = 29;
        }
        else
        {
          message = 28;
        }
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        message = 30;
        break;
      default:
        message = -1;
        break;
    }
    return message;
  }
  public String getAstroSign()
  {
    String message;
    if ((day >= 21 && month == 3) || (day <= 19 && month == 4))
    {
      message = "Aries";
    }
    else if ((day >= 20 && month == 4) || (day <= 20 && month == 5))
    {
      message = "Taurus";
    }
    else if ((day >= 21 && month == 5) || (day <= 20 && month == 6))
    {
      message = "Gemini";
    }
    else if ((day >= 23 && month == 7) || (day <= 22 && month == 8))
    {
      message = "Leo";
    }
    else if ((day >= 23 && month == 8) || (day <= 22 && month == 9))
    {
      message = "Virgo";
    }
    else if ((day >= 23 && month == 9) || (day <= 22 && month == 10))
    {
      message = "Libra";
    }
    else if ((day >= 23 && month == 10) || (day <= 21 && month == 11))
    {
      message = "Scorpio";
    }
    else if ((day >= 22 && month == 11) || (day <= 21 && month == 12))
    {
      message = "Sagittarius";
    }
    else if ((day >= 22 && month == 12) || (day <= 19 && month == 1))
    {
      message = "Capricorn";
    }
    else if ((day >= 20 && month == 1) || (day <= 18 && month == 2))
    {
      message = "Aquarius";
    }
    else if ((day >= 19 && month == 2) || (day <= 20 && month == 3))
    {
      message = "Pisces";
    }
    else
    {
      message = "Invalid input!";
    }
    return message;
  }
  public String dayOfWeek()
  {
    String dayOfTheWeek = "";
    int m;
    int newYear = year;
    switch (month)
    {
      case 1:
        newYear -= 1;
        m = 13;
        break;
      case 2:
        newYear -= 1;
        m = 14;
        break;
      case 3:
        m = 3;
        break;
      case 4:
        m = 4;
        break;
      case 5:
        m = 5;
        break;
      case 6:
        m = 6;
        break;
      case 7:
        m = 7;
        break;
      case 8:
        m = 8;
        break;
      case 9:
        m = 9;
        break;
      case 10:
        m = 10;
        break;
      case 11:
        m = 11;
        break;
      case 12:
        m = 12;
        break;
      default:
        m = -1;
        break;
    }
    int k = newYear % 100;
    int j = newYear / 100;

    int calculator = (day + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

    switch (calculator)
    {
      case 0:
        dayOfTheWeek = "Saturday";
        break;
      case 1:
        dayOfTheWeek = "Sunday";
        break;
      case 2:
        dayOfTheWeek = "Monday";
        break;
      case 3:
        dayOfTheWeek = "Tuesday";
        break;
      case 4:
        dayOfTheWeek = "Wednesday";
        break;
      case 5:
        dayOfTheWeek = "Thursday";
        break;
      case 6:
        dayOfTheWeek = "Friday";
        break;

    }
    return dayOfTheWeek;
  }
  public String getMonthName()
  {
    String monthName;
    switch (month)
    {
      case 1:
        monthName = "January";
        break;
      case 2:
        monthName = "February";
        break;
      case 3:
        monthName = "March";
        break;
      case 4:
        monthName = "April";
        break;
      case 5:
        monthName = "May";
        break;
      case 6:
        monthName = "June";
        break;
      case 7:
        monthName = "July";
        break;
      case 8:
        monthName = "August";
        break;
      case 9:
        monthName = "September";
        break;
      case 10:
        monthName = "October";
        break;
      case 11:
        monthName = "November";
        break;
      case 12:
        monthName = "December";
        break;
      default:
        monthName = "Enter valid month.";
    }
    return monthName;
  }
  public void nextDay ()
  {
    day++;
    if (day > daysInMonth())
    {
      day = 1;
      month++;
      if (month > 12)
      {
        month = 1;
        year++;
      }
    }
  }
  public void nextDay(int days)
  {
    for (int i = 0; i < days; i++)
    {
      day++;
      if (day > daysInMonth())
      {
        day = 1;
        month++;
        if (month > 12)
        {
          month = 1;
          year++;
        }
      }
    }
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof MyDate))
    {
      return false;
    }
    MyDate other = (MyDate)obj;

    return day == other.day
        && month == other.month
        && year == other.year;

  }
  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }
  public static MyDate today()
  {
    int currentDay = todayDate.get(GregorianCalendar.DATE);
    int currentMonth = todayDate.get(GregorianCalendar.MONTH)+1;
    int currentYear = todayDate.get(GregorianCalendar.YEAR);

    return new MyDate(currentDay, currentMonth, currentYear);
  }
  public boolean isBefore(MyDate secondDate)
  {
    if (this.year > secondDate.year)
    {
      return false;
    }
    else if (this.month > secondDate.month)
    {
      return false;
    }
    else if (this.day >= secondDate.day)
    {
      return false;
    }
    else
      return true;
  }
  public String toString()
  {
    return day+"/"+month+"/"+year;
  }
}
