public class PriorityNote extends Note
{
  private int priority;

  public PriorityNote(String message, int priority)
  {
    super(message);
    this.priority = priority;
  }
  public int getPriority()
  {
    return priority;
  }
  public Note copy()
  {
    return new PriorityNote(getMessage(), priority);
  }
  public String toString()
  {
    return super.toString() + " with priority " + priority;
  }
}
