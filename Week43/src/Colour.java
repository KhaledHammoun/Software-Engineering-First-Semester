public class Colour
{
  private int red;
  private int green;
  private int blue;

  public Colour(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public void set(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }
  public int getRed()
  {
    return red;
  }
  public int getGreen()
  {
    return green;
  }
  public int getBlue()
  {
    return blue;
  }
  public boolean isGray()
  {
    return green == red && red == blue;
  }
  public void mixWith(Colour colour2)
  {
    this.red += colour2.red;
    this.green += colour2.green;
    this.blue += colour2.blue;
  }
  public Colour copy()
  {
    return new Colour(red, green, blue);
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Colour))
      return false;
    Colour other = (Colour)obj;
    return this.red == other.red
        && this.green == other.green
        && this.blue == other.blue;
  }
  public String toString()
  {
    return "The colour: " +red+":"+green+":"+red;
  }
}
