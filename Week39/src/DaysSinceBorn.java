import java.util.Scanner;

public class DaysSinceBorn
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    MyDate date = new MyDate();
    MyDate todaysDate = new MyDate();
    int daysPassed = 0;

    System.out.print("Enter your birthday: ");
    String birthdayDate = scan.nextLine();
    String[] tokens = birthdayDate.split("/");

    date.setDay(Integer.parseInt(tokens[0]));
    date.setMonth(Integer.parseInt(tokens[1]));
    date.setYear(Integer.parseInt(tokens[2]));


    System.out.print("Enter todays date: ");
    String todayDate = scan.nextLine();
    tokens = todayDate.split("/");

    todaysDate.setDay(Integer.parseInt(tokens[0]));
    todaysDate.setMonth(Integer.parseInt(tokens[1]));
    todaysDate.setYear(Integer.parseInt(tokens[2]));

    while (!(todaysDate.toString().equals(date.toString())))
    {
      daysPassed++;
      date.nextDay();
    }

    System.out.println(++daysPassed);
  }
}
