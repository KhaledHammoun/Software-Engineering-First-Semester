public class Bear extends Animal
{
  private boolean isSleeping;

  public Bear(boolean isSleeping, int legs)
  {
    super(legs);
    this.isSleeping = isSleeping;
  }

  public boolean isAsleep()
  {
    return isSleeping;
  }

  public String getSound()
  {
    return "mrr";
  }

  public String toString()
  {
    return super.toString() + " A bear sleeping (" + isSleeping + ")";
  }
}
