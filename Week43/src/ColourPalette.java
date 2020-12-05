import java.util.ArrayList;

public class ColourPalette
{
  private int numberOfColours;
  private ArrayList<Colour> colours;

  public ColourPalette(int maxNumberOfColours)
  {
    numberOfColours = maxNumberOfColours;
    colours = new ArrayList<Colour>();
  }
  public int getNumberOfColours()
  {
    return colours.size();
  }
  public void add(Colour colour)
  {
    colours.add(colour.copy());
  }
  public Colour get(int index)
  {
    return colours.get(index).copy();
  }
  public int getNumberOfGrayColours()
  {
    int counter = 0;

    for (Colour el: colours)
    {
      if (el.isGray())
        counter++;
    }
    return counter;
  }
  public void mixColour(int index, Colour colour2)
  {
    colours.get(index).mixWith(colour2);
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof ColourPalette))
      return false;
    ColourPalette other = (ColourPalette)obj;
    return this.colours.equals(other.colours);
  }
  public String toString()
  {
    String str= "";
    for (Colour el : colours)
    {
      str += el + "\n";
    }
    return str;
  }
}
