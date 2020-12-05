public class Note
{
  public String message;
  public boolean highPriority;

  public Note(String message)
  {
    this.message = message;
    highPriority = false;
  }
  public String getMessage()
  {
    return message;
  }
  public void setMessage(String message)
  {
    this.message = message;
  }
  public boolean isHighPriority()
  {
    return highPriority;
  }
  public void setToHighPriority()
  {
    highPriority = true;
  }
  public void setToLowPriority()
  {
    highPriority = false;
  }
  public Note copy()
  {
    Note temp = new Note(message);
    if (highPriority)
    {
      temp.setToHighPriority();
    }
    else
    {
      temp.setToLowPriority();
    }
    return temp;
  }
  public String toString()
  {
    String temp = "";
    if (message == null)
    {
      return "Empty";
    }
    else
    {
      return "Message: " + message + ", is it with high priority: " + highPriority;
    }
  }
}

