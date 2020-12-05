import java.util.Scanner;

public class UsernameAndPassword
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Username: ");
    String username = scan.nextLine();

    System.out.print("Enter password: ");
    String password = scan.nextLine();

    System.out.print("Confirm password: ");
    String confirmPassword = scan.nextLine();

    System.out.println("Username: " + username);

    if (password.equals(confirmPassword))
    {
      System.out.println("Passwords match");
    }
    else
    {
      System.out.println("Passwords don´t match");
    }
  }
}
