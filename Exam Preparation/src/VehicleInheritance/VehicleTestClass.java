package VehicleInheritance;

public class VehicleTestClass
{
  public static void main(String[] args)
  {
    SportsCar audi = new SportsCar("Khaled Hammoun", 42000.5, "PA8696KH", 220);
    Van VW = new Van("Salih Osman", 80000, "AL46868", 3500);
    Car citroen = new Car("Eliza Manciu", 46000, "AM53483");
    Bicycle bianci = new Bicycle("Khaled Hammoun", 3000, 27);

    audi.setOwner("Selqnin");
    audi.setPrice(45000);
    VW.setOwner("Someone else");
    citroen.setOwner("Khaled Hammoun");

    System.out.println(audi);
    System.out.println(VW);
    System.out.println(citroen);
    System.out.println(bianci);
  }
}

