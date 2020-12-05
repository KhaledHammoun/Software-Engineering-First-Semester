public class Website
{
    private String url;
    private boolean needsUpdate;

    public Website(String url)
    {
      this.url = url;
      needsUpdate = false;
    }
    public String getUrl()
    {
      return url;
    }
    public boolean needsUpdate()
    {
      return needsUpdate;
    }
    public void markAsNotUpdated()
    {
      needsUpdate = true;
    }
    public void markAsUpdated()
    {
      needsUpdate = false;
    }
    public boolean equals(Object obj)
    {
      if (!(obj instanceof Website))
        return false;
      Website other = (Website)obj;
      return this.url.equals(other.url)
          && this.needsUpdate == other.needsUpdate;
    }
    public String toString()
    {
      return "Website: " + url;
    }



}
