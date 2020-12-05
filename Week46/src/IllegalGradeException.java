public class IllegalGradeException extends RuntimeException
{
  public IllegalGradeException()
  {
    super("Invalid grade.");
  }
  public IllegalGradeException(String msg)
  {
    super("Invalid grade. " + msg);
  }
}
