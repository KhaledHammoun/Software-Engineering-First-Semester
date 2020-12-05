import java.io.Serializable;

public class Owner implements Serializable
{
  private String firstName;
  private String lastName;

  public Owner(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String toString()
  {
    return "Owners names: " + firstName + " " + lastName;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Owner))
      return false;

    var other = (Owner)obj;
    return this.firstName.equals(other.firstName)
        && this.lastName.equals(other.lastName);
  }
}

