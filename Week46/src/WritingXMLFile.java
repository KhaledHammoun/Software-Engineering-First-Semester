import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WritingXMLFile
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    PrintWriter write = null;
    System.out.println("Enter file name: ");
    String fileName = scan.nextLine();

    ArrayList<Student> students = new ArrayList<Student>();

    for (int i = 0; i < 5; i++)
    {
      System.out.println("Enter student name and grade:");
      students.add(new Student(scan.nextLine(), Integer.parseInt(scan.nextLine())));
    }
    try
    {
      FileOutputStream fileOut = new FileOutputStream("c:/Software Engineering VIA/1.Semester One/SDJ/Excercises/ReadWriteFiles/"+fileName, true);
      write = new PrintWriter(fileOut);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not created.");
      System.exit(1);
    }
    write.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    write.write("<students>");
    for (Student el : students)
    {
      write.write("\t<"+ el.getClass().getName().toLowerCase() + ">");

      write.write(("\t\t<name>" + el.getName()) + "</name>");
      write.write(("\t\t<grade>" + el.getGrade()) + "</grade>");

      write.write("\t</"+ el.getClass().getName().toLowerCase() + ">");
    }
    write.write("</students>");
    write.close();
    System.out.println("Done writing to file.");
  }
}
