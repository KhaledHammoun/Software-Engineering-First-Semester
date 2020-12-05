public class MyNumber
{
  private int number;

  public MyNumber(int number)
  {
    this.number = number;
  }

  public int getNumber()
  {
    return number;
  }
  public int getLastDigit()
  {
    String numToString = String.valueOf(number);
    return Integer.parseInt(String.valueOf(numToString.charAt(numToString.length()-1)));
  }
  public int getFirstDigit()
  {
    String numToString = String.valueOf(number);
    return Integer.parseInt(String.valueOf(numToString.charAt(0)));
  }
  public boolean isDivisibleBy(int anotherInt)
  {
    return (number % anotherInt) == 0;
  }
  public int numberOfProperDivisors()
  {
    int counter = 0;
    for (int i = 1; i < this.number; i++)
    {
      if (isDivisibleBy(i))
      {
        counter++;
      }
    }
    return counter;
  }
  public boolean isPrime()
  {
    return numberOfProperDivisors()  == 1;
  }
  public String toString()
  {
    return isPrime() ? "\"" + this.number + " (a prime number)\"" : "\"" + this.number + "\"";
  }
  public MyNumber plus(MyNumber obj)
  {
    if (obj == null)
    {
      obj = new MyNumber(0);
    }

    return new MyNumber(number + obj.number);
  }
  public boolean isPerfectNumber()
  {
    int sum = 0;
    for (int i = 1; i < number; i++)
    {
      if (isDivisibleBy(i))
      {
        sum += i;
      }
    }
    return sum == number;
  }
}
