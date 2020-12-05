public class ClockClassTest
{
  public static void main(String[] args)
  {
    Clock clock = new Clock(15, 15,15);
    System.out.println(clock.timeTo(new Clock(300)));
    System.out.println(clock.timeInSecondsTo(new Clock(300)));
    clock.setTimeFormat(12);
    System.out.println(clock);
  }
}
