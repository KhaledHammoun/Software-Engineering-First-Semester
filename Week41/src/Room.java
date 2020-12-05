public class Room
{
  private int number;
  private Guest guest;
  private Bed bed;

  public Room(int number, String bedType)
  {
    this.number = number;
    bed = new Bed(bedType);
    guest = null;
  }

  public int getNumber()
  {
    return number;
  }

  public int getFloor()
  {
    String num = String.valueOf(number);
    int floorNUmber = num.charAt(0);
    return floorNUmber;
  }

  public double getPrice()
  {
    if (bed.isSingle())
      return 59.50;
    else if (bed.isDouble())
      return 72.40;
    else if (bed.isKingSize())
      return 89.00;
    else
      return 0;
  }

  public boolean isOccupied()
  {
    if (guest != null)
      return true;
    else
      return false;
  }

  public void registerGuest(Guest guest)
  {
    this.guest = guest;
  }

  public void vacate()
  {
    this.guest = null;
  }

  public String getBedType()
  {
    return bed.toString();
  }

  public Guest getGuest()
  {
    return guest;
  }
}
