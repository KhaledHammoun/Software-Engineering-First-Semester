import java.util.ArrayList;

public class SiteAdministrator
{
  private String name;
  private SiteCollection siteCollection;

  public SiteAdministrator(String name)
  {
    this.name = name;
    siteCollection = new SiteCollection(50);
  }
  public String getName()
  {
    return name;
  }
  public SiteCollection getSiteCollection()
  {
    return siteCollection;
  }
  public Website getNextSiteToUpdate()
  {
    for (Website el : siteCollection.getAllNotUpdatesSites())
    {
      if (el.needsUpdate())
        return el;
    }
    return null;
  }
  public Website[] getAllSiteToUpdate()
  {
    ArrayList<Website> temp = new ArrayList<Website>();
    for (Website el : siteCollection.getAllNotUpdatesSites())
    {
      if (el.needsUpdate())
        temp.add(el);
    }
    return temp.toArray(new Website[0]);
  }
}
