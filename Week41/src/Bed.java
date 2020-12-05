public class Bed
{
  private String type;

  public Bed(String type)
  {
    this.type = type;
  }
  public boolean isKingSize()
  {
    return type.toLowerCase().equals("king size");
  }
  public boolean isDouble()
  {
    return type.toLowerCase().equals("double");
  }
  public boolean isSingle()
  {
    return type.toLowerCase().equals("single");
  }
  public String toString()
  {
    return type;
  }
}
