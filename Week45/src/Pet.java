public abstract class Pet extends Animal
{
  private String name;

  public Pet (int age, String name)
  {
    super(age);
    this.name = name;
  }
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public String toString()
  {
    return super.toString() + " a pet named " + name;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Pet))
      return false;

    Pet other = (Pet)obj;
    return super.equals(other) && this.name.equals(other.name);
  }
}
