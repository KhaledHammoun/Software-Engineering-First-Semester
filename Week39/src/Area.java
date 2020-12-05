public class Area
{
  public static double Area(double r)
  {
    return Math.PI * Math.pow(r, 2);
  }
  public static double Area(double r, double h, double PI)
  {
    PI = Math.PI;
    return Math.PI * Math.pow(r, 2)* h;
  }
  public static double Area(double w, double l)
  {
    return w*l;
  }
}
