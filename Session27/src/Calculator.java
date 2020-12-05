import java.util.ArrayList;

public class Calculator
{
  private double result;
  private ArrayList<Double> numbers;
  public void addition(double number)
  {
    for (Double num : numbers)
    {
      result += num;
      numbers.add(result);
      numbers.remove(num);
    }
  }
  public void subtraction(ArrayList<Double> numbers)
  {
    for (Double num : numbers)
    {
      result -= num;
    }

  }
  public void multiplication (double number)
  {
    if (result == 0)
      result = number;
    else
      result *= number;
  }
  public void division(double number)
  {
    if (result == 0)
      result = number;
    else
      result /= number;
  }
  public double equal()
  {
    return result;
  }
  public void clear()
  {
    result = 0;
  }
}
