public class ToyClassTest
{
  public static void main(String[] args)
  {
    Toy[] toys = new Toy[3];
    toys[0] = new Lego(8, 100);
    toys[1] = new Football(3, 25);
    toys[2] = new Handball(2, 20);

    for (Toy el : toys)
    {
      System.out.println(el);
    }

    for (Toy el : toys)
    {
      System.out.println(el.play());
    }
  }
}
