import java.util.Scanner;

public class Question1
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please, enter first number: ");
    int numOne = scan.nextInt();

    System.out.print("Please, enter second number: ");
    int numTwo = scan.nextInt();

    System.out.print("Please, enter third number: ");
    int numThree = scan.nextInt();

    System.out.println("The product of (" + numOne + " * " + numTwo + ") is " + (numOne*numTwo));

    System.out.println("The sum of (" + numOne + " + " + numTwo + ") is " + (numOne+numTwo));
    System.out.println("The quotient of (" + numTwo + " / " + numThree + ") is " + (numTwo*1.0/numThree));
    System.out.println("The difference of (" + numTwo + " - " + numThree + ") is " + (numTwo-numThree));

  }

}
