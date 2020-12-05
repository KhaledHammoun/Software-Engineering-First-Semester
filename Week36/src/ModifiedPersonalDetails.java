import java.util.Scanner;

public class ModifiedPersonalDetails
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Insert your name: ");
    String name = keyboard.nextLine();

    System.out.print("Insert your age: ");
    int age = keyboard.nextInt();

    keyboard.nextLine();
    System.out.print("Insert your address: ");
    String address = keyboard.nextLine();

    System.out.print("Your name is " + name + " and you are " + age +
                       " years old and your address is " + address + ".");
  }
}
