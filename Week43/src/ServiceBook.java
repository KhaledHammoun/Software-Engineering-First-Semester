import java.util.ArrayList;

public class ServiceBook
{
  private ArrayList<Service> services;

  public ServiceBook()
  {
    services = new ArrayList<Service>();
  }
  public void addServices(Service service)
  {
    services.add(service);
  }
  public int getNumberOfServices()
  {
    return services.size();
  }
  public Service getService(int index)
  {
    return services.get(index);
  }
  public Service[] getAllServices()
  {
    Service[] temp = new Service[services.size()];
    temp = services.toArray(temp);
    return temp;
  }
  public int[] getAllServicesMileage()
  {
    int[] temp = new int[services.size()];
    for (int i = 0; i<services.size(); i++)
    {
      temp[i] = services.get(i).getMileage();
    }
    return temp;
  }
  public boolean hasServiceOnDate(Date date)
  {
    for (int i = 0; i<services.size(); i++)
    {
      if (services.get(i).getDate().equals(date))
        return true;
    }
    return false;
  }
  public Date getDateOfLastService()
  {
    return services.get(services.size()-1).getDate();
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof ServiceBook))
      return false;
    ServiceBook other = (ServiceBook)obj;
    return this.services.equals(other.services);
  }
  public String toString()
  {
    String str = "";
    for (Service el: services)
    {
      str += el.toString() + "\n";
    }
    return str;
  }
}
