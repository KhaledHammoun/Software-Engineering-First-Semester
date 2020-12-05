import java.util.Scanner;

public class MeterConverter
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter feet to be converted: ");
    double feet = keyboard.nextDouble();

    double resultInMeters = feet * 0.305;

    System.out.println(feet + " feet is " + resultInMeters + " meters");
  }
}
