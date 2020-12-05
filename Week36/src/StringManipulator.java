import java.util.Scanner;

public class StringManipulator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please type your favorite city: ");
    String favoriteCity = keyboard.nextLine();

    int cityCharCount = favoriteCity.length();

    System.out.println("Number of characters in " + favoriteCity + " is " +
                        cityCharCount + ".\nIn upper case is " + favoriteCity.toUpperCase() +
                        ".\nTo lower case is " + favoriteCity.toLowerCase() +
                        ".\nThe first character of the city name is " + favoriteCity.charAt(0) + ".");
  }
}
