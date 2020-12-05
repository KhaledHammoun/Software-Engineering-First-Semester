import java.util.Scanner;

public class RomanNumbers
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number within the range 1-10");
    int number = keyboard.nextInt();

    if (number == 1)
    {
      System.out.println("1=I");
    }
    else if (number == 2)
    {
      System.out.println("2=II");
    }
    else if (number == 3)
    {
      System.out.println("3=III");
    }
    else if (number == 4)
    {
      System.out.println("4=IV");
    }
    else if (number == 5)
    {
      System.out.println("5=V");
    }
    else if (number == 6)
    {
      System.out.println("6=VI");
    }
    else if (number == 7)
    {
      System.out.println("7=VII");
    }
    else if (number == 8)
    {
      System.out.println("8=VIII");
    }
    else if (number == 9)
    {
      System.out.println("9=IX");
    }
    else if (number == 10)
    {
      System.out.println("10=X");
    }
    else
    {
      System.out.println("Error");
    }

  }
}




