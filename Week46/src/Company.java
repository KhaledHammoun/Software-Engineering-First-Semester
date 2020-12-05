import java.util.stream.Stream;

public class Company extends Customer
{
  private String field;
  private String ownersName;

  public Company(String name, String address, String field, String ownersName)
  {
    super(name, address);
    this.field = field;
    this.ownersName = ownersName;
  }

  public String getField()
  {
    return field;
  }

  public String getOwnersName()
  {
    return ownersName;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Company))
      return false;

    var other = (Company)obj;
    return super.equals(other)
        && this.field.equals(other.field)
        && this.ownersName.equals(other.ownersName);
  }
  public String toString()
  {
    return super.toString() + " the companies field of work is " +
        field + " and the owner is " + ownersName;
  }

  public String getType()
  {
    return "business";
  }
}
