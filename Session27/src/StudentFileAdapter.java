import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentFileAdapter
{
   private MyFileIO mfio;
   private String fileName;

   public StudentFileAdapter(String fileName)
   {
      mfio = new MyFileIO();
      this.fileName = fileName;
   }
 
   // Use the MyFileIO class to retrieve a StudentList object with all Students
   public StudentList getAllStudents()
   {
      StudentList students = new StudentList();

      try
      {
         students = (StudentList)mfio.readObjectFromFile(fileName);
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error reading file");
      }
      catch (ClassNotFoundException e)
      {
         System.out.println("Class Not Found");
      }
      return students;
   }

   // Use the MyFileIO class to retrieve a StudentList object with all Students
   // from the given country
   public StudentList getStudentsFrom(String fromCountry)
   {
      StudentList students = new StudentList();

      try
      {
         StudentList result = (StudentList)mfio.readObjectFromFile(fileName);

         for (int i = 0; i < result.size(); i++)
         {
            if (result.get(i).getCountry().equals(fromCountry))
            {
               students.add(result.get(i));
            }
         }
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error reading file");
      }
      catch (ClassNotFoundException e)
      {
         System.out.println("Class Not Found");
      }

      return students;
   }

   // Use the MyFileIO class to save all Students in the StudentList object
   public void saveStudents(StudentList students)
   {
      try
      {
         mfio.writeToFile(fileName, students);
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error writing to file");
      }
   }
 
   // Change the country of the Student with the given firstname and lastname
   public void changeCountry(String firstName, String lastName, String country)
   {
      StudentList students = getAllStudents();

      for (int i = 0; i < students.size(); i++)
      {
         Student student = students.get(i);

         if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName))
         {
            student.setCountry(country);
         }
      }

      saveStudents(students);
   }

   // Add more methods to the adapter depending on what you wish to do
}
