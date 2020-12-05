public abstract class Ball extends Toy
{
  private int diameter;

  public Ball(int suitableAge, int diameter)
  {
    super(suitableAge);
    this.diameter = diameter;
  }
  public int getDiameter()
  {
    return diameter;
  }
  public String toString()
  {
    return super.toString() + " The toy is a ball with diameter " + diameter + ",";
  }
}
