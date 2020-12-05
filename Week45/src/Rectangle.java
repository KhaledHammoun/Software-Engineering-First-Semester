public class Rectangle extends TwoDimensionalShapes
{
  private int width;
  private int length;

  public Rectangle(int x, int y, int width, int length)
  {
    super(x, y);
    this.width = width;
    this.length = length;
  }
  public int getWidth()
  {
    return width;
  }
  public void setWidth(int width)
  {
    this.width = width;
  }
  public int getLength()
  {
    return length;
  }
  public void setLength(int length)
  {
    this.length = length;
  }
  public double getArea()
  {
    return (double)width*length;
  }
  public String toString()
  {
    return super.toString() + " a rectangle with area: " + getArea();
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Rectangle))
      return false;

    Rectangle other = (Rectangle)obj;
    return super.equals(other)
        && this.width == other.width
        && this.length == other.length;
  }
}
