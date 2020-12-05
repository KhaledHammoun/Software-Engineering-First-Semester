import java.text.MessageFormat;
import java.util.Scanner;

public class YearsCalculator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter amount of minutes: ");
    long minutes = keyboard.nextLong();
    long years = 0;
    long days = 0;
    long minutesLeft = minutes;

    if (minutesLeft > 525600)
    {
      years = minutesLeft / 525600;
      minutesLeft %= 525600;
    }
    if (minutesLeft > 1440)
    {
      days = minutesLeft / 1440;
      minutesLeft %= 1440;
    }

    System.out.println(MessageFormat.format(
        "In {0} minutes is approximately {1} years and {2} days and {3} minutes.",
        minutes, years, days, minutesLeft));
  }
}
