public class Point
{
  private int xAxis;
  private int yAxis;

  public Point(int xAxis, int yAxis)
  {
    this.xAxis = xAxis;
    this.yAxis = yAxis;
  }

  public void moveTo(int newX, int newY)
  {
    xAxis = newX;
    yAxis = newY;
  }

  public void move(int xDistance, int yDistance)
  {
    xAxis += xDistance;
    yAxis += yDistance;
  }

  public int getXAxis()
  {
    return xAxis;
  }

  public int getYAxis()
  {
    return yAxis;
  }

  public String toString()
  {
    return "(" + xAxis + "," + yAxis + ")";
  }
}
