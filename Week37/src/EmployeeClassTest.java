import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeClassTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    List<Employee> employees = new ArrayList<Employee>();
    System.out.print("Enter data separated by \", \": ");
    String input = keyboard.nextLine();
    while (!input.equals("End"))
    {
      Employee employeeToAdd = new Employee();
      System.out.print("Enter data separated by \", \": ");
      String[] tokens = input.split(", ");
      employeeToAdd.setName(tokens[0]);
      employeeToAdd.setIdNumber(Integer.parseInt(tokens[1]));
      employeeToAdd.setDepartment(tokens[2]);
      employeeToAdd.setPosition(tokens[3]);
      employees.add(employeeToAdd);
      input = keyboard.nextLine();
    }

    for (int i = 0; i < employees.size(); i++)

    {
      /*System.out.println("Employee: \n\n" + "\t" + employees.get(i).getName());
      System.out.println("\t" + employees.get(i).getIdNumber());
      System.out.println("\t" + employees.get(i).getDepartment());
      System.out.println("\t" + employees.get(i).getPosition() + "\n");*/
      System.out.println(employees.get(i));
    }
  }
}
