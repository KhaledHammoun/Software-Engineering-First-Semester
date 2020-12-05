public class Reservation
{
  private String timePeriod;
  private String roomNumber;
  private String nameOfFacultyMember;

  public Reservation(String timePeriod, String roomNumber,
      String nameOfFacultyMember)
  {
    this.timePeriod = timePeriod;
    this.roomNumber = roomNumber;
    this.nameOfFacultyMember = nameOfFacultyMember;
  }

  public void setTimePeriod(String timePeriod)
  {
    this.timePeriod = timePeriod;
  }

  public void setRoomNumber(String roomNumber)
  {
    this.roomNumber = roomNumber;
  }

  public void setNameOfFacultyMember(String nameOfFacultyMember)
  {
    this.nameOfFacultyMember = nameOfFacultyMember;
  }

  public String getTimePeriod()
  {
    return timePeriod;
  }

  public String getRoomNumber()
  {
    return roomNumber;
  }

  public String getNameOfFacultyMember()
  {
    return nameOfFacultyMember;
  }
}
