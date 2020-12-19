import java.io.Serializable;
import java.util.ArrayList;

public class StudentList implements Serializable
{
   // ArrayList for storing the Student objects
	private ArrayList<Student> students;

	// Constructor for initializing the ArrayList 
	public StudentList()
	{
		students = new ArrayList<Student>();
	}
  
	// Add a Student to the list 
	public void add(Student student)
	{
		students.add(student);
	}
  
	// Replace the Student object at index with student
	public void set(Student student, int index)
	{
		students.set(index, student);
	}

	// Return the Student object at index if one exists,
	// else return null
	public Student get(int index)
	{
		if(index<students.size())
		{
			return students.get(index);
		}
		else
		{
			return null;
		}
	}

	// Get the Student object with the given firstName and lastName
	// if one exists, else return null
	public Student get(String firstName, String lastName)
	{
		for(int i = 0; i<students.size(); i++)
		{
			Student temp = students.get(i);
			
			if(temp.getFirstName().equals(firstName) && temp.getLastName().equals(lastName))
			{
				return temp;
			}
		}
		
		return null;
	}
	
	// Return the index of the Student object with the given 
	// firstName and lastName if one exists, else return -1
	public int getIndex(String firstName, String lastName)
	{
		for(int i = 0; i<students.size(); i++)
		{
			Student temp = students.get(i);
			
			if(temp.getFirstName().equals(firstName) && temp.getLastName().equals(lastName))
			{
				return i;
			}
		}	
		return -1;
	}
	
	// Return how many Student objects are in the list
	public int size()
	{
		return students.size();
	}
    	 
	// The toString method in ArrayList doesn't give a good result
	// with many Student objects, so I make my own toString and 
	// manually add a newline after each student 
	public String toString()
	{
		String returnStr = "";
	
		for(int i = 0; i<students.size(); i++)
		{
			Student temp = students.get(i);
		
			returnStr += temp +"\n";
		}	
		return returnStr;
	}
}
