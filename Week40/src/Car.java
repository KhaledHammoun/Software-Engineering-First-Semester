public class Car
{
  private String make;
  private String model;
  private String colour;
  private String licenseNumber;
  private int year;

  public Car(String make, String model, String colour, String licenseNumber,
      int year)
  {
    this.make = make;
    this.model = model;
    this.colour = colour;
    this.licenseNumber = licenseNumber;
    this.year = year;
  }

  public Car(String make, String model, String colour, int year)
  {
    this.make = make;
    this.model = model;
    this.colour = colour;
    licenseNumber = "Missing license plate";
    this.year = year;
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColour()
  {
    return colour;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public int getYear()
  {
    return year;
  }

  public void setColour(String colour)
  {
    this.colour = colour;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public Car copy()
  {
    return new Car(make, model, colour, licenseNumber, year);
  }

  public String toString()
  {
    return "Car make: " + make + " model: " + model + " colour: " + colour
        + " license number: " + licenseNumber + " year: " + year;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Car))
    {
      return false;
    }
    Car other = (Car)obj;

    return this.toString().equals(other.toString());
  }
}
