public class IllegalDateException extends RuntimeException
{
  public IllegalDateException()
  {
    super("Invalid date.");
  }

  public IllegalDateException(String msg)
  {
    super("Invalid date. " + msg);
  }
}
