public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate firstDate = new MyDate(03, 02, 1995);
    MyDate secondDate = new MyDate(firstDate);

    if (firstDate.equals(secondDate))
    {
      System.out.println("Works");
    }
    MyDate thirdDate = secondDate.copy();
    secondDate.setYear(1994);
    System.out.println(thirdDate);
    System.out.println(secondDate);

    firstDate.nextDay(35);

    System.out.println(firstDate);

    MyDate toCompare = new MyDate(23, 9, 2020);

    MyDate newDate = new MyDate();
    System.out.println(newDate.isBefore(toCompare));
  }
}
