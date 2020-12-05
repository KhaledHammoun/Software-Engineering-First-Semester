import java.util.ArrayList;

public class KinderGarden
{
  private int countTeachers;
  private ArrayList<Child> children;

  public KinderGarden()
  {
    countTeachers = 0;
    children = new ArrayList<Child>();
  }
  public void addChild(Child child)
  {
    children.add(child);
  }
  public void removeChild(Child child)
  {
    children.remove(child);
  }
  public void hireTeachers(int counter)
  {
    countTeachers = counter;
  }
  public void fireTeacher()
  {
    countTeachers--;
  }
  public int countChildren()
  {
    return children.size();
  }
  public int countTeachers()
  {
    return countTeachers;
  }
  public double getAverageChildAge()
  {
    double sum = 0;
    for (Child el : children)
    {
      sum += el.getAge();
    }
    return sum/children.size();
  }
  public double getNorm()
  {
    return (double)children.size()/ countTeachers;
  }
  public void celebrateBirthday(String name)
  {
    for (Child el : children)
    {
      if (el.getName().equals(name))
        el.setAge(el.getAge()+1);
    }
  }
  public String toString()
  {
    //TODO later
    return "";
  }
}
