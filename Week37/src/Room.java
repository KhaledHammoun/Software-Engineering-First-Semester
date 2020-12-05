public class Room
{
  private String block;
  private String floorNumber;
  private int numberOfSeats;
  private boolean hasProjector;

  public Room(String block, String floorNumber)
  {
    this.block = block;
    this.floorNumber = floorNumber;
    numberOfSeats = 0;
    hasProjector = false;
  }

  public void setNumberOfSeats(int numberOfSeats)
  {
    this.numberOfSeats = numberOfSeats;
  }

  public void setHasProjector(boolean hasProjector)
  {
    this.hasProjector = hasProjector;
  }

  public String getBlock()
  {
    return block;
  }

  public String getFloorNumber()
  {
    return floorNumber;
  }

  public int getNumberOfSeats()
  {
    return numberOfSeats;
  }

  public boolean getHasProjector()
  {
    return hasProjector;
  }


}
