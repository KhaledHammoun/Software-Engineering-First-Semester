public class Handball extends Ball
{
  public Handball(int suitableAge, int diameter)
  {
    super(suitableAge, diameter);
  }
  public String play()
  {
    return "Throw";
  }
  public String toString()
  {
    return super.toString() + " and it is a handball ball.";
  }
}
