public class Spider extends Animal
{
  private int eyes;

  public Spider(int legs, int eyes)
  {
    super(legs);
    this.eyes = eyes;
  }

  public int getEyes()
  {
    return eyes;
  }

  public String getSound()
  {
    return "pss";
  }

  public String toString()
  {
    return super.toString() + " Spider with " + eyes + " eyes.";
  }
}
