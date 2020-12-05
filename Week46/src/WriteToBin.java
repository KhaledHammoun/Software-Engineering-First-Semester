import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.ObjectOutputStream;

public class WriteToBin
{
  public static void main(String[] args)
  {
    MyFileIO toBIN = new MyFileIO();
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Enter file name: ");
    String fileName = scan.nextLine();

    System.out.print("Enter how many integers you want: ");
    int num = Integer.parseInt(scan.nextLine());
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    for (int i = 0; i < num; i++)
    {
      numbers.add(random.nextInt(100));
    }
    try
    {
      toBIN.writeToFile("c:/Software Engineering VIA/1.Semester One/SDJ/Excercises/ReadWriteFiles/"+fileName, numbers.toArray(new Object[0]));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found or cant be created.");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
      System.exit(1);
    }
    System.out.println("Done writing to file.");
  }
}
