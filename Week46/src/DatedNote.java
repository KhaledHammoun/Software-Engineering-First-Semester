public class DatedNote extends Note
{
  private MyDate date;

  public DatedNote(String message, MyDate date)
  {
    super(message);
    this.date = date;
  }
  public MyDate getDate()
  {
    return date.copy();
  }
  public Note copy()
  {
    return new DatedNote(getMessage(), date);
  }
  public String toString()
  {
    return super.toString() + " about the date " + date;
  }
}
