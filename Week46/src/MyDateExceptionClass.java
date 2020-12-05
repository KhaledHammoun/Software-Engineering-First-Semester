public class MyDateExceptionClass
{
  public static void main(String[] args)
  {
    MyDate newDate = new MyDate();
    try
    {
      newDate.setMonth(2);
      newDate.setYear(2021);
      newDate.setDay(29);

    }
    catch (IllegalDateException e)
    {
      System.err.println(e.getMessage());
    }
    System.out.println(newDate);
  }
}
