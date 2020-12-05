public class Cat extends Pet
{
  private boolean isAHouseCat;

  public Cat(int age, String name)
  {
    super(age, name);
    isAHouseCat = false;
  }
  public boolean isAHouseCat()
  {
    return isAHouseCat;
  }
  public void setAsAHouseCat()
  {
    isAHouseCat = true;
  }
  public void setNotAHouseCat()
  {
    isAHouseCat = false;
  }
  public String speak()
  {
    return "Meow";
  }
  public String toString()
  {
    return super.toString() + " " + (isAHouseCat ? "indoors":"outdoors") + " cat.";
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Cat))
      return false;

    Cat other = (Cat)obj;
    return super.equals(other) && this.isAHouseCat == other.isAHouseCat;
  }
}
