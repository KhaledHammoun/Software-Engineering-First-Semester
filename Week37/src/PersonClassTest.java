public class PersonClassTest
{
  public static void main(String[] args)
  {
    Person firstPerson = new Person("Elzia", "060687");
    Person secondPerson = new Person();
    Person thirdPerson = new Person();

    firstPerson.setName("Eliza Manciu");
    firstPerson.setBirthday("06.06.1987");

    secondPerson.setName("Khaled Hammoun");
    secondPerson.setBirthday("03.02.1995");

    System.out.println("First person details: "
                        + "\n" + firstPerson.getName()
                        + "\n" + firstPerson.getBirthday());

    System.out.println();

    System.out.println("Second person details: "
                        + "\n" + secondPerson.getName()
                        + "\n" + secondPerson.getBirthday());
  }
}
