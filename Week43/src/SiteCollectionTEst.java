public class SiteCollectionTEst
{
  public static void main(String[] args)
  {
    Website firstWebsite = new Website("abv.bg");
    Website secondWebsite = new Website("instagram.com");
    Website thirdWebsite = new Website("mobile.bg");
    Website fourthWebsite = new Website("facebook.com");

    SiteCollection siteCollection = new SiteCollection(4);

    siteCollection.addSite(firstWebsite);
    siteCollection.addSite(secondWebsite);
    siteCollection.addSite(thirdWebsite);
    siteCollection.addSite(fourthWebsite);

    siteCollection.removeSite("abv.bg");

    System.out.println();
  }
}
