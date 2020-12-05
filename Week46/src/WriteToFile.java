import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class WriteToFile
{
  public static void main(String[] args)
  {
    MyTextFileIO textModifier = new MyTextFileIO();
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter file name: ");
    String fileName = scan.nextLine();

    ArrayList<String> friends = new ArrayList<String>();

    System.out.print("Enter a name or DONE to terminate: ");
    String name;

    while (!(name = scan.nextLine()).equals("DONE"))
    {
      System.out.print("Enter a name or DONE to terminate: ");
      friends.add(name);
    }

    try
    {
      textModifier.appendToFile(fileName, friends.toArray(new String[0]));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found or cant be created.");
      System.exit(1);
    }
    /*for (int i = 0; i < friends.size(); i++)
    {
      write.println(friends.get(i));
    }
    for (String element : friends)
    {
      write.println(element);
    }
    write.close();*/
    System.out.println("Writing to file done.");
  }
}
