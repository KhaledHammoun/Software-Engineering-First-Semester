public class LandTract
{
  private double tractLength;
  private double tractWidth;

  public LandTract(double tractLength, double tractWidth)
  {
    this.tractLength = tractLength;
    this.tractWidth = tractWidth;
  }
  public LandTract()
  {
    this.tractLength = 0;
    this.tractWidth = 0;
  }

  public void setTractLength(double tractLength)
  {
    this.tractLength = tractLength;
  }
  public void setTractWidth(double tractWidth)
  {
    this.tractWidth = tractWidth;
  }
  public double getTractLength()
  {
    return tractLength;
  }
  public double getTractWidth()
  {
    return tractWidth;
  }
  public double tractArea()
  {
    return tractWidth*tractLength;
  }
  public boolean equals(LandTract secondTract)
  {
    if (this.tractArea() == secondTract.tractArea())
    {
      return true;
    }
    return false;
  }
  public String toString()
  {
    return String.valueOf(this.tractArea());
  }

}
