import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFIle
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Scanner read = null;

    System.out.print("Enter file name to read from: ");
    String fileName = scan.nextLine();

    try
    {
      FileInputStream fileIn = new FileInputStream("c:/Software Engineering VIA/1.Semester One/SDJ/Excercises/ReadWriteFiles/"+fileName);
      read = new Scanner(fileIn);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found.");
      System.exit(1);
    }
    System.out.println("Contents of the file " + fileName);
    while (read.hasNext())
    {
      System.out.println(read.nextLine());
    }
    read.close();
    System.out.println("Done reading from file.");
  }
}
