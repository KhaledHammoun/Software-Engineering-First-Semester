public class Football extends Ball
{
  public Football(int suitableAge, int diameter)
  {
    super(suitableAge, diameter);
  }
  public String play()
  {
    return "Kick";
  }
  public String toString()
  {
    return super.toString() + " and its a football ball.";
  }
}
