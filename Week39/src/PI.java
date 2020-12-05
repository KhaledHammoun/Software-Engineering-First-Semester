import java.text.DecimalFormat;
import java.util.Scanner;

public class PI
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    DecimalFormat decimal = new DecimalFormat("#.#####");
    double PI = 0;

    /*System.out.print("Enter iterations: ");
    double iterations = Double.parseDouble(scan.nextLine());
    /*for (int i = 1; i <= iterations; i++)
    {
      PI += Math.pow(-1, i + 1) / (2 * i - 1);
    }
    PI *= 4;*/
    double iterations = 0;
    double i = 1;

    while (!decimal.format(PI*4).equals(decimal.format(Math.PI)))
    {
      PI += Math.pow(-1, i + 1) / (2 * i - 1);
      i++;
      iterations++;
    }

    System.out.println("Iterations: " + iterations);
    System.out.println(decimal.format(PI*4));
    System.out.println(decimal.format(Math.PI));
  }
}

