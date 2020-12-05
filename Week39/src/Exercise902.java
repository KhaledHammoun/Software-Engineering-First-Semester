import java.util.Scanner;

public class Exercise902
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    MyDate date = new MyDate();

    System.out.print("Enter start year: ");
    int startYear = Integer.parseInt(scan.nextLine());
    System.out.print("Enter end year: ");
    int endYear = Integer.parseInt(scan.nextLine());

    int numberOfLeapYears = 0;

    for (int i = startYear; i <= endYear; i++)
    {
      date.setYear(i);
      if (date.isLeapYear())
      {
        numberOfLeapYears++;
      }
    }

    System.out.println(numberOfLeapYears);
  }
}
