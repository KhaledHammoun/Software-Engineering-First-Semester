import java.util.Scanner;
public class UsernamePasword
{
  public static void main(String []args)
  {
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter user name: ");
    String userName=keyboard.nextLine();

    System.out.println("Enter password: ");
    String password=keyboard.nextLine();

    System.out.println("Enter confirmation password: ");
    String confirmationPassword=keyboard.nextLine();

    System.out.println("The user name is: "+userName);

    if (password.equals(confirmationPassword))
    {
      System.out.println("Password and confirmation password match");
    }
    else
    {
      System.out.println("Error matching passwords");
    }
  }
}
