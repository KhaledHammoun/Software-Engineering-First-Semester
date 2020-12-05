import javax.swing.plaf.IconUIResource;

public class Hotel
{
  private String name;
  private Room[] rooms;

  public Hotel(String name, Room[] rooms)
  {
    this.name = name;
    this.rooms = rooms;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public int getNumberOfAvailableRooms()
  {
    int counter = 0;
    for (Room el : rooms)
    {
      if (!el.isOccupied())
      {
        counter++;
      }
    }
    return counter;
  }

  public Room getFirstAvailableRoom()
  {
    for (Room el : rooms)
    {
      if (!el.isOccupied())
      {
        return el;
      }
    }
    return null;
  }

  public Room getFirstAvailableRoom(double maxPrice)
  {
    for (Room el : rooms)
    {
      if (!(el.isOccupied()) && el.getPrice() <= maxPrice)
      {
        return el;
      }
    }
    return null;
  }

  public Room[] getAllAvailableRooms(String bedType)
  {
    int counter = 0;
    for (Room el: rooms)
    {
      if (!(el.isOccupied()) && el.getBedType().toLowerCase() == bedType.toLowerCase())
      {
        counter++;
      }
    }
    Room[] toReturn = new Room[counter];
    for (Room el: rooms)
    {
      if (!(el.isOccupied()) && el.getBedType().toLowerCase() == bedType.toLowerCase())
      {
        for (int i = 0; i < toReturn.length; i++)
        {
          if (toReturn[i] == null)
          {
            toReturn[i] = el;
          }
        }
      }
    }
    return toReturn;
  }

  public boolean hasGuest(Guest guest)
  {
    if (guest == null)
      return false;

    for (Room el : rooms)
    {
      if (el.getGuest() != null)
      {
        return el.getGuest().equals(guest);
      }
    }
    return false;
  }

  public Room getRoom(Guest guest)
  {
    if (guest == null)
      return null;

    for (Room el: rooms)
    {
      if (el.getGuest().equals(guest))
        return el;
    }
    return null;
  }
}
