public class Frog extends Animal
{
  private String colour;
  public Frog(int age, String colour)
  {
    super(age);
    this.colour = colour;
  }
  public String getColour()
  {
    return colour;
  }
  public void setColour(String colour)
  {
    this.colour = colour;
  }
  public String speak()
  {
    return "Ribbit";
  }
  public String toString()
  {
    return super.toString() + " a " + colour +" frog.";
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Frog))
      return false;

    Frog other = (Frog)obj;
    return super.equals(other) && this.colour.equals(other.colour);
  }

}

