public class Bee extends Animal
{
  private boolean isAHoneyBee;

  public Bee(int age)
  {
    super(age);
    isAHoneyBee = false;
  }
  public boolean getIsAHoneyBee()
  {
    return isAHoneyBee;
  }
  public void setAsAHoneyBee()
  {
    isAHoneyBee = true;
  }
  public void setAsNotHoneyBee()
  {
    isAHoneyBee = false;
  }
  public String speak()
  {
    return "Bzzz";
  }
  public String toString()
  {
    return super.toString() + " " + (isAHoneyBee ? "a": "not a") + " honey bee";
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Bee))
      return false;

    Bee other = (Bee)obj;
    return super.equals(other) && this.isAHoneyBee == other.isAHoneyBee;
  }
}

