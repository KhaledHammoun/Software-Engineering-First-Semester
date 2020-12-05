import java.util.ArrayList;

public class TVSeries
{
  private String title;
  private int numberOfEpisodes;
  private ArrayList<Actor> actors;

  public TVSeries(String title)
  {
    this.title = title;
    numberOfEpisodes = 0;
    actors = new ArrayList<Actor>();
  }
  public void hireActor(Actor actor)
  {
    actors.add(actor);
  }
  public int getNumberOfActors()
  {
    return actors.size();
  }
  public Actor getActor(int index)
  {
    return actors.get(index);
  }
  public void awardEmmy(String name)
  {
    for (Actor el: actors)
    {
      if (el.getName().equals(name))
        el.awardEmmy();
    }
  }
  public void shootAnEpisode()
  {
    numberOfEpisodes++;
  }
  public ArrayList<Actor> getEmmyWinners()
  {
    ArrayList<Actor> temp = new ArrayList<Actor>();
    for (Actor el: actors)
    {
      if (el.getNumberOfEmmys() > 0)
        temp.add(el);
    }
    return temp;
  }
  public String toString()
  {
    StringBuilder str = new StringBuilder(
        "The TV series " + title + " with " + numberOfEpisodes
            + " episodes, with playing actors:\n");
    for (Actor el : actors)
    {
      str.append(el.getName()).append("\n");
    }
    return str.toString();
  }
}
