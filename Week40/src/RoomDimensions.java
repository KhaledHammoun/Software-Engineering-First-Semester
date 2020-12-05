public class RoomDimensions
{
  public double length;
  public double width;

  public RoomDimensions(double length, double width)
  {
    this.length = length;
    this.width = width;
  }
  public RoomDimensions()
  {
    length = 0;
    width = 0;
  }

  public double getArea()
  {
    return length*width;
  }
  public String toString()
  {
    return "Room length = " + length + " room width = " + width;
  }
}
