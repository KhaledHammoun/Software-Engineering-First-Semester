public class Circle extends TwoDimensionalShapes
{
  private double radius;

  public Circle (int x, int y, double radius)
  {
    super(x, y);
    this.radius = radius;
  }
  public double getRadius()
  {
    return radius;
  }
  public void setRadius(double radius)
  {
    this.radius = radius;
  }
  public double getArea()
  {
    return Math.pow(radius, 2)*Math.PI;
  }
  public String toString()
  {
    return super.toString() + " a circle with area: " + getArea();
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Circle))
      return false;

    Circle other = (Circle)obj;
    return super.equals(other) && this.radius == other.radius;
  }
}
