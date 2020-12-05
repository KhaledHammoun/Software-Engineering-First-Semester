public class HotelRoom
{
  private int roomNumber;
  private double rent;
  private Guest guest;

  public HotelRoom(int roomNumber, double rent)
  {
    this.roomNumber = roomNumber;
    this.rent = rent;
    guest = new Guest(null);
  }

  public int getRoomNumber()
  {
    return roomNumber;
  }

  public double getRent()
  {
    return rent;
  }

  public Guest getGuest()
  {
    return guest;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public boolean isAvailable()
  {
    /*String test = guest.getName();

    if(null != test)
    {
      return false;
    }
    else
    {
      return true;
    }*/
    return guest == null;
  }

  public void checkIn(Guest guest)
  {
    if (isAvailable())
    {
      this.guest = guest;
    }
  }

  public void checkOut()
  {
    guest = new Guest(null);
  }

  public String toString()
  {
    String str = "Room number: " + roomNumber +"\nrent: " + rent;

    if (isAvailable())
    {
      str += "\nGuest: " + guest.getName();
    }

    return  str;
  }
}
