import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MakeHTMLFile
{
  public static void main(String[] args)
  {
    Scanner read = null;
    PrintWriter write = null;
    ArrayList<String> htmlDoc = new ArrayList<String>();
    ArrayList<Student> list = new ArrayList<Student>();
    list.add(new Student("Bob", 4));
    list.add(new Student("Jane", 12));
    list.add(new Student("John", 7));

    try
    {
      FileInputStream fileIn = new FileInputStream("C:\\Software Engineering VIA\\1.Semester One\\SDJ\\Excercises\\ReadWriteFiles\\template.txt");
      read = new Scanner(fileIn);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found.");
      System.exit(1);
    }
    while (read.hasNext())
    {
      String line = read.nextLine();
      if (line.contains("$title"))
      {
        line = line.replace("$title", "Student List");
      }
      else if (line.contains("$header"))
      {
        line = line.replace("$header", "Student List");
      }
      else if (line.contains("$paragraph1"))
      {
        line = line.replace("$paragraph1", "This is a student list.");
      }
      else if (line.contains("$tableHeader1"))
      {
        line = line.replace("$tableHeader1", "Name").replace("$tableHeader2", "Grade");
      }
      else if (line.contains("$tableData1"))
      {

        for (Student student : list)
        {
          String temp = line;
          temp = temp
              .replace("<tr><td>$tableData1</td><td>$tableData2</td></tr>",
                  "<tr><td>" + student.getName() + "</td><td>" + student
                      .getGrade() + "</td></tr>");
          htmlDoc.add(temp);
        }
        break;
      }
      htmlDoc.add(line);
    }
    read.close();
    System.out.println("Done reading.");
    try
    {
      FileOutputStream fileOut = new FileOutputStream("C:\\Software Engineering VIA\\1.Semester One\\SDJ\\Excercises\\ReadWriteFiles\\template.html");
      write = new PrintWriter(fileOut);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found.");
      System.exit(1);
    }

    for (String el : htmlDoc)
    {
      write.write(el);
    }
    write.close();
    System.out.println("Done writing.");
  }
}
