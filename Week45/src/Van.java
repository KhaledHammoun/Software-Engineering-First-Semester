public class Van extends Car
{
  public int maxLoad;

  public Van(String owner, double price, String regNo, int maxLoad)
  {
    super(owner, price, regNo);
    this.maxLoad = maxLoad;
  }
  public int getMaxLoad()
  {
    return maxLoad;
  }
  public String toString()
  {
    return super.toString() + " van with maximum loading capacity of " + maxLoad + " kg";
  }
}
