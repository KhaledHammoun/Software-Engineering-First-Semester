import java.util.Scanner;

public class CalculatorVAT
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Insert sale tax: ");
    double saleTax = keyboard.nextDouble();

    System.out.print("Price of first item: ");
    int firstItem = keyboard.nextInt();

    System.out.print("Price of second item: ");
    int secondItem = keyboard.nextInt();

    System.out.print("Price of third item: ");
    int thirdItem = keyboard.nextInt();

    int itemsSum = firstItem + secondItem + thirdItem;
    double afterTax = itemsSum * (saleTax/100) + itemsSum;
    double tax = afterTax - itemsSum;

    System.out.println("Tax: " + tax);
    System.out.println("Total: " + afterTax);
  }
}
