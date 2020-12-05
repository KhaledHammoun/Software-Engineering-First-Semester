import java.io.FileNotFoundException;
import java.io.IOException;

public class LoadInitialData
{
   public static void main(String[] args)
   {
      StudentList students = new StudentList();

      MyTextFileIO mtfio = new MyTextFileIO();
      String[] studentArray = null;
      try
      {
         studentArray = mtfio.readArrayFromFile("students.txt");
                      
         for(int i = 0; i<studentArray.length; i++)
         {
            String temp = studentArray[i];
            String[] tempArr = temp.split(",");
            String firstName = tempArr[0];
            String lastName = tempArr[1];
            String country = tempArr[2];

            students.add(new Student(firstName, lastName, country));
         }
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File was not found, or could not be opened");
      }
     
      MyFileIO mfio = new MyFileIO();
      
      try
      {
         mfio.writeToFile("students.bin", students);
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Error opening file ");
      }
      catch (IOException e)
      {
         System.out.println("IO Error writing to file ");
      }
      
      System.out.println("Done");
   }
}
