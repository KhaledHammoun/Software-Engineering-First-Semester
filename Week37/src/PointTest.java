public class PointTest
{
  public static void main(String[] args)
  {
    Point firstPoints = new Point(3,4);
    Point secondPoints = new Point(5,6);

    firstPoints.move(2,5);
    System.out.println(firstPoints); // (5,9)
    firstPoints.moveTo(4,3);
    System.out.println(firstPoints);

    double distance = Math.sqrt(Math.pow((secondPoints.getXAxis() - firstPoints.getXAxis()), 2)
                  + Math.pow((secondPoints.getYAxis() - firstPoints.getYAxis()), 2));

    System.out.println((int)distance);
  }
}
