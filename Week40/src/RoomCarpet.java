public class RoomCarpet
{
  private RoomDimensions roomDimensions;
  private double pricePerSqrF;

  public RoomCarpet(RoomDimensions dim, double pricePerSqrF)
  {
    roomDimensions = dim;
    this.pricePerSqrF = pricePerSqrF;
  }
  public double getTotalCost()
  {
    return roomDimensions.getArea() * pricePerSqrF;
  }
  public String toString()
  {
    return "Price = " + pricePerSqrF + " Total price = " + getTotalCost();
  }
}

