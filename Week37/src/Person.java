public class Person
{
  private String name;
  private String birthday;

  public void setName(String personsName)
  {
    name = personsName;
  }
  public Person(String name, String birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }

  public Person()
  {
    name = "";
    birthday = "";
  }
  public  void setBirthday(String personsBirthday)
  {
    birthday = personsBirthday;
  }

  public String getName()
  {
    return name;
  }

  public String getBirthday()
  {
    return birthday;
  }

  public String toString()
  {
    return  "Person details: "
        + "\n" + name
        + "\n" + birthday;
  }
}
