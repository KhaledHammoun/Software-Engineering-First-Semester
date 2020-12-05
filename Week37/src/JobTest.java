import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JobTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    List<Job> jobs = new ArrayList<Job>();

    System.out.print("Enter data: ");
    String input = keyboard.nextLine();

    while (!input.equals("End"))
    {
      String[] tokens = input.split(", ");
      Job jobToAdd = new Job(tokens[0], Double.parseDouble(tokens[1]), tokens[2], tokens[3]);
      jobs.add(jobToAdd);
      System.out.print("Enter data: ");
      input = keyboard.nextLine();
    }
    for (Job job : jobs)
    {
      System.out.println(job);
    }
  }
}
