public class Actor
{
  private String name;
  private int numberOfEmmys;
  private int numberOfEpisodes;

  public Actor(String name)
  {
    this.name = name;
    numberOfEmmys = 0;
    numberOfEpisodes = 0;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
  public int getNumberOfEmmys()
  {
    return numberOfEmmys;
  }
  public void awardEmmy()
  {
    numberOfEmmys++;
  }
  public int getNumberOfEpisodes()
  {
    return numberOfEpisodes;
  }
  public void participateInEpisode()
  {
    numberOfEpisodes++;
  }
}
