public class HotelRoomTest
{
  public static void main(String[] args)
  {
    HotelRoom first = new HotelRoom(201, 25.5);
    HotelRoom second = new HotelRoom(202, 35.7);
    HotelRoom third = new HotelRoom(203, 40.1);

    first.setRent(30.1);

    Guest firstGuest = new Guest("David");
    Guest secondGuest = new Guest("Olav");

    first.checkIn(firstGuest);
    second.checkIn(secondGuest);

    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
  }
}
