import java.util.ArrayList;

public class SiteCollection
{
  private int size;
  private ArrayList<Website> webSites;

  public SiteCollection(int maxSize)
  {
    size = maxSize;
    webSites = new ArrayList<Website>();
  }
  public int getNumberOfSites()
  {
    return webSites.size();
  }
  public int getNumberOfUpdatedSites()
  {
    int counter = 0;
    for (Website el : webSites)
    {
      if (!el.needsUpdate())
        counter++;
    }
    return counter;
  }
  public void addSite(Website site)
  {
    if (webSites.size() < size)
      webSites.add(site);
  }
  public void removeSite(String url)
  {
    //TODO check if works Doesnt
    Website temp = new Website(url);
    webSites.remove(temp);
  }
  public Website[] getAllSites()
  {
    Website[] temp = new Website[webSites.size()];
    temp = webSites.toArray(temp);
    return temp;
  }
  public Website[] getAllNotUpdatesSites()
  {
    ArrayList<Website> temp = new ArrayList<Website>();
    for (Website el : webSites)
    {
      if (el.needsUpdate())
        temp.add(el);
    }
    return temp.toArray(new Website[0]);
  }
  public String toString()
  {
    String str = "";
    for (Website el : webSites)
    {
      str += el + "\n";
    }
    return str;
  }
}
