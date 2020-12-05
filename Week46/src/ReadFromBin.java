import java.io.*;
import java.util.Scanner;

public class ReadFromBin
{
  public static void main(String[] args)
  {
    MyFileIO toBin = new MyFileIO();
    Scanner scan = new Scanner(System.in);
    System.out.print("Write the name of the file you want to read from: ");
    String fileName = scan.nextLine();
    Object[] objs = null;
    try
    {
      objs = toBin.readArrayFromFile("c:/Software Engineering VIA/1.Semester One/SDJ/Excercises/ReadWriteFiles/"+fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found.");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file.");
      System.exit(1);
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class not found.");
      System.exit(1);
    }
    for (Object obj : objs)
    {
      System.out.println(obj);
    }
    System.out.println("Done reading from file.");
  }
}
