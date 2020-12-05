public abstract class Animal
{
  private int age;

  public Animal (int age)
  {
    this.age = age;
  }
  public int getAge()
  {
    return age;
  }
  public void setAge(int age)
  {
    this.age = age;
  }
  public abstract String speak();
  public String toString()
  {
    return "Animals age: " + age;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Animal))
      return false;

    Animal other = (Animal)obj;
    return this.age == other.age;
  }
}
