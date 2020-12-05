import java.util.ArrayList;

public class Test
{
  public static void main(String[] args)
  {
    ArrayList<String> names = new ArrayList<>();

    String myName = "Khaled";
    String yourName = "Eliza";



    int sizeMax;
    sizeMax = 20;

    for (int i = 0; i < 100; i++)
    {
      if (names.size()<sizeMax)
      {
        String num = String.valueOf(i);
        names.add(num);
      }
    }
    System.out.println(names);
  }
}
