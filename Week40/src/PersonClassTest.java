public class PersonClassTest
{
  public static void main(String[] args)
  {
    Address address = new Address("Hjelmagerparlken", "464", "8541", "Løgten", "Denamrk");
    MyDate birthday = new MyDate(28,9,1995);
    Person firstPerson = new Person("Eliza", address, birthday);
    firstPerson.rememberThis("az sam ti si toi e te sa");
    System.out.println("Is brain damaged (f): " + firstPerson.isBrainDamaged());
    firstPerson.rememberThis("12345446781");
    firstPerson.rememberThis("12345446785");
    System.out.println("Is brain damaged (f): " + firstPerson.isBrainDamaged());
    firstPerson.rememberThis("az sam ti si toi e te sa");
    System.out.println("IQ = 130: " + firstPerson.getIQ());
    System.out.println(firstPerson);
    Person secondPerson = firstPerson;
    System.out.println(firstPerson.getAge());
    System.out.println(firstPerson.equals(secondPerson));
    System.out.println(firstPerson.getShortAddress());
  }
}
