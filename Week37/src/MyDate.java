import java.text.MessageFormat;

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

  public void displayDate()
  {
    System.out.println(String.format("%s/%s/%s", day, month, year));
  }

  public boolean isLeapYear()
  {
    int num = year % 4;
    if (year % 4 == 0)
    {
      if (year % 100 == 0 && year % 400 == 0)
      {
        return true;
      }
      else
      {
        return false;
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
}
