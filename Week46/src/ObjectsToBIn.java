import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectsToBIn
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Student firstStudent = new Student("Eliza", 4);
    Student secondStudent = new Student("Khaled", 12);

    System.out.print("Enter file name: ");
    String fileName = scan.nextLine();

    try
    {
      FileOutputStream fileOut = new FileOutputStream("c:/Software Engineering VIA/1.Semester One/SDJ/Excercises/ReadWriteFiles/"+fileName);
      ObjectOutputStream write = new ObjectOutputStream(fileOut);

      write.writeObject(firstStudent);
      write.writeObject(secondStudent);
      write.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File cant be created.");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file.");
      System.exit(1);
    }

    System.out.println("Done writing to file.");
  }
}
