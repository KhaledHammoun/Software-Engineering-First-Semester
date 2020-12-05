public class ServiceBookTest
{
  public static void main(String[] args)
  {
    Date firstDate = new Date(03, 02, 1995);
    Date secondDate = new Date(06, 06, 1987);

    Service firstService = new Service(10000, firstDate);
    Service secondService = new Service(15000, secondDate);

    ServiceBook serviceBook = new ServiceBook();

    serviceBook.addServices(firstService);
    serviceBook.addServices(secondService);

    System.out.println(serviceBook.getDateOfLastService());
    System.out.println(serviceBook.getNumberOfServices());
    System.out.println(serviceBook);
  }
}
