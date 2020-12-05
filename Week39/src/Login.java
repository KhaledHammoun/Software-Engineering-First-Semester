import java.util.Scanner;

public class Login
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String username;
    String password;
    String confirmationPassword;

    System.out.print("Enter username: ");
    username = scan.nextLine();
    do
    {
      System.out.print("Enter password: ");
      password = scan.nextLine();
      System.out.print("Enter confirmation password: ");
      confirmationPassword = scan.nextLine();
      if (!password.equals(confirmationPassword))
      {
        System.out.println("The two passwords must be identical."
                          + "\nPlease try again.");
      }
    }while (!password.equals(confirmationPassword));

    System.out.println("Successful sign in.");
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }
}
