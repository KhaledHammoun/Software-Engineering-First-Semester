public class Person
{
  private String name;
  private Address address;
  private MyDate birthday;
  private Brain brain;

  public Person(String name, Address address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
    this.brain = new Brain();
  }
  public Person(String name, MyDate birthday)
  {
    this.name = name;
    address = null;
    this.birthday = birthday.copy();
    this.brain = new Brain();
  }
  public Person(MyDate birthday)
  {
    name = "";
    address = null;
    this.birthday = birthday.copy();
    this.brain = new Brain();
  }
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public Address getAddress()
  {
    return address;
  }
  public void setAddress(Address address)
  {
    this.address = address;
  }
  public MyDate getBirthday()
  {
    return birthday.copy();
  }
  public int getAge()
  {
    int age = 0;
    for (int i = MyDate.today().getYear(); i > birthday.getYear(); i--)
    {
      age++;
    }
    if (birthday.getMonth() >= MyDate.today().getMonth())
    {
      if (birthday.getDay() > MyDate.today().getDay())
      {
        age--;
      }
    }
    return age;
  }
  public String toString()
  {
    return "Person name: " + name
        + "\nPerson address: " + address
        + "\nPerson birthday: " + birthday
        + "\nPerson IQ is: " + brain.getIQ();
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
    {
      return false;
    }
    Person other = (Person)obj;

    return this.name == other.name
        && this.address == other.address
        && this.birthday.equals(other.birthday)
        && this.brain.equals(other.brain);
  }
  public boolean doYouRemember(String topic)
  {
    return brain.recall(topic);
  }
  public void rememberThis(String topic)
  {
    if (brain.recall(topic))
    {
      brain.refreshMemory(topic);
    }
    else
    {
      brain.remember(topic);
    }
  }
  public String whatAreYouThinkingAbout()
  {
    return brain.recall();
  }
  public int getIQ()
  {
    return brain.getIQ();
  }
  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }
  public String getShortAddress()
  {
    return address.street + " " + address.number;
  }
}