public class Address
{
  public String street;
  public String number;
  public String postalCode;
  public String city;
  public String country;

  public Address(String st, String num, String PO, String c, String country)
  {
    street = st;
    number = num;
    postalCode = PO;
    city = c;
    this.country = country;
  }
  public void setAddress(String st, String num, String PO, String c, String country)
  {
    street = st;
    number = num;
    postalCode = PO;
    city = c;
    this.country = country;
  }
  public String getStreet()
  {
    return street;
  }
  public void setStreet(String st)
  {
    street = st;
  }
  public String getNumber()
  {
    return number;
  }
  public void setNumber(String num)
  {
    number = num;
  }
  public String getPostalCode()
  {
    return postalCode;
  }
  public void setPostalCode(String PO)
  {
    postalCode = PO;
  }
  public String getCity()
  {
    return city;
  }
  public void setCity(String ci)
  {
    city = ci;
  }
  public String getCountry()
  {
    return country;
  }
  public void setCountry(String co)
  {
    country = co;
  }
  public String toString()
  {
    return "Address: " + street + " " + number + ", " + postalCode + " " + city + ", " + country;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Address))
    {
      return false;
    }
    Address other = (Address)obj;

    return this.street.equals(other.street)
        && this.number.equals(other.number)
        && this.postalCode.equals(other.postalCode)
        && this.city.equals(other.city)
        && this.country.equals(other.country);
  }
}

