public class Dog extends Pet
{
  private String breed;

  public Dog(int age, String name, String breed)
  {
    super(age, name);
    this.breed = breed;
  }
  public String getBreed()
  {
    return breed;
  }
  public void setBreed(String breed)
  {
    this.breed = breed;
  }
  public String speak()
  {
    return "Woof";
  }
  public String toString()
  {
    return super.toString() + " a dog from the breed " + breed;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Dog))
      return false;

    Dog other = (Dog)obj;
    return super.equals(other) && this.breed.equals(other.breed);
  }
}
