import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class SortingNumbers
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList<Double> numbers = new ArrayList<Double>();

    System.out.print("Enter numbers divided by \", \": ");
    String input = scan.nextLine();

    String[] numbersToAddAsString = input.split(", ");

    for ( String num : numbersToAddAsString)
    {
      numbers.add(Double.parseDouble(num));
    }
    Collections.sort(numbers);
    for (var num : numbers)
    {
      System.out.println(num);
    }
  }
}
