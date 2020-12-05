import java.io.*;
import java.util.Scanner;

public class ObjectsFromBin
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a file to read from: ");
    String fileName = scan.nextLine();

    try
    {
      FileInputStream fileIn = new FileInputStream("c:/Software Engineering VIA/1.Semester One/SDJ/Excercises/ReadWriteFiles/"+fileName);
      ObjectInputStream read = new ObjectInputStream(fileIn);
      while (true)
      {
        try
        {
          System.out.println(read.readObject());
        }
        catch (EOFException e)
        {
          System.out.println("File empty.");
          break;
        }
        catch (ClassNotFoundException e)
        {
          System.out.println("Class not found.");
          break;
        }
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found.");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading from file.");
      System.exit(1);
    }
    System.out.println("Done reading form file.");
  }
}
