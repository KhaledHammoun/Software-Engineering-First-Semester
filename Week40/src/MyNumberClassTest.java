public class MyNumberClassTest
{
  public static void main(String[] args)
  {
    MyNumber n1 = new MyNumber(28);
    MyNumber n2 = new MyNumber(31);

    System.out.println(n1.getNumber());
    System.out.println(n1.getLastDigit());
    System.out.println(n1.getFirstDigit());
    System.out.println(n1.isDivisibleBy(7));
    System.out.println(n1.numberOfProperDivisors());
    System.out.println(n1.isPrime());
    System.out.println(n2.isPrime());
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n1.plus(n2));
    System.out.println(n1.plus(null));
    System.out.println(n1.isPerfectNumber());
  }
}
