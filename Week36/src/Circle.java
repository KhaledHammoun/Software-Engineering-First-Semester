public class Circle
{
  public static void main(String[] args)
  {
    double circleRadius = 22.5;

    double circleCircumference = 2*Math.PI*circleRadius;
    double circleArea = Math.PI*Math.pow(circleRadius, 2);

    System.out.println("Circumference: " + circleCircumference);
    System.out.println("Area: " + circleArea);
  }
}
