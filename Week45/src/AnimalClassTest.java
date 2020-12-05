public class AnimalClassTest
{
  public static void main(String[] args)
  {
    Animal[] animals = new Animal[4];
    animals[0] = new Bee(1);
    animals[1] = new Cat(5, "Mini");
    animals[2] = new Dog(3, "Gosho", "Ovcharka");
    animals[3] = new Frog(2, "green");
    ((Bee)animals[0]).setAsAHoneyBee();
    for (Animal el: animals)
    {
      System.out.println(el.speak());
    }
  }
}
