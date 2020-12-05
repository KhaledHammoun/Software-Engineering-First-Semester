public abstract class TwoDimensionalShapes
{
  private int x;
  private int y;

  public TwoDimensionalShapes(int x, int y)
  {
    this.x = x;
    this.y = y;
  }
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public void moveTo(int x, int y)
  {
    this.x += x;
    this.y += y;
  }
  public abstract double getArea();
  public String toString()
  {
    return "At: ("+x+","+y+")";
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof TwoDimensionalShapes))
      return false;

    TwoDimensionalShapes other = (TwoDimensionalShapes)obj;
    return this.x == other.x && this.y == other.y;
  }
}
