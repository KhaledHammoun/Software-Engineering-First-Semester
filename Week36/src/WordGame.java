import java.text.MessageFormat;
import java.util.Scanner;

public class WordGame
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Name: ");

    String name = keyboard.nextLine();
    System.out.print("Age: ");

    int age = keyboard.nextInt();
    System.out.print("City: ");
    keyboard.nextLine();
    String city = keyboard.nextLine();

    System.out.print("College: ");
    String college = keyboard.nextLine();

    System.out.print("Profession: ");
    String profession = keyboard.nextLine();

    System.out.print("Animal type: ");
    String animal = keyboard.nextLine();

    System.out.print("Pet`s name: ");
    String pet = keyboard.nextLine();

    System.out.println(MessageFormat.format(
        "There once was a person named {0} who lived in {1}. At the age of {2}, {0} went to college at {3}. {0} graduated and went to work as a {4}. Then, {0} adopted a {5} named {6}. They both lived happily ever after!",
        name, city, age, college, profession, animal, pet));
  }
}
