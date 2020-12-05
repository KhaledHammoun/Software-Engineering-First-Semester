import java.text.DecimalFormat;

public class Clock
{
  private int hour;
  private int minute;
  private int second;
  private boolean timeFormat24 = true;

  public Clock(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Clock(int totalTimeInSeconds)
  {
    if (totalTimeInSeconds >= 3600)
    {
      hour = totalTimeInSeconds / 3600;
      totalTimeInSeconds %= 3600;
    }
    else
      hour = 0;

    if (totalTimeInSeconds >= 60)
    {
      minute = totalTimeInSeconds / 60;
      totalTimeInSeconds %= 60;
    }
    else
      minute = 0;

    second = totalTimeInSeconds;
  }

  public void set(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public void tic()
  {
    second ++;
    if (second >= 60)
    {
      second = 0;
      minute++;
      if (minute >= 60)
      {
        minute = 0;
        hour++;
      }
    }
  }

  public int convertToSeconds()
  {
    return (hour * 3600) + (minute * 60) + second;
  }

  public boolean isBefore(Clock time)
  {
    return time.convertToSeconds() < this.convertToSeconds();
  }

  public int timeInSecondsTo(Clock time)
  {
    return Math.abs(time.convertToSeconds() - this.convertToSeconds());
  }

  public Clock timeTo(Clock time)
  {
    int sec = Math.abs(time.convertToSeconds() - this.convertToSeconds());

    return new Clock(sec);
  }

  public boolean isTimeFormat24()
  {
    return timeFormat24;
  }

  public void setTimeFormat(int hourFormat)
  {
    if (hourFormat == 12)
    {
      timeFormat24 = false;
    }
    else if (hourFormat == 24)
    {
      timeFormat24 = true;
    }
  }
  public String toString()
  {
    DecimalFormat formatter = new DecimalFormat("00");
    if (timeFormat24)
    return formatter.format(hour) + ":" + formatter.format(minute) + ":" + formatter.format(second);
    else
    {
      String AMorPM = hour > 12 ? "PM": "AM";
      hour = hour > 12 ? hour %= 12: hour;
      return hour + ":" + formatter.format(minute) + ":" + formatter.format(second) + " " + AMorPM;
    }
  }
}
