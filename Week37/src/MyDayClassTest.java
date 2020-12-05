public class MyDayClassTest
{
  public static void main(String[] args)
  {
    MyDate firstDay = new MyDate();
    MyDate secondDay = new MyDate();

    firstDay.setDay(3);
    firstDay.setMonth(2);
    firstDay.setYear(1800);

    secondDay.setDay(6);
    secondDay.setMonth(6);
    secondDay.setYear(1987);

    firstDay.displayDate();
    secondDay.displayDate();

    System.out.println(firstDay.isLeapYear());
    System.out.println(firstDay.daysInMonth());
    System.out.println(firstDay.getAstroSign());

  }
}
