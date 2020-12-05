import java.util.Scanner;

public class CylinderData
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Cylinder radius: ");
    double radius = keyboard.nextDouble();
    System.out.print("Cylinder length: ");
    double length = keyboard.nextDouble();

    double area = Math.pow(radius, 2) * Math.PI;
    double volume = area * length;

    System.out.println("The aria is " + area);
    System.out.println("The volueme is " + volume);
  }
}
