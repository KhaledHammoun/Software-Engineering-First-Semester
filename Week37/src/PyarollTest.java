import java.util.Scanner;

public class PyarollTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Payroll employeeOne = new Payroll();
    Payroll employeeTwo = new Payroll();
    System.out.print("Enter employee name: ");
    employeeOne.setName(keyboard.nextLine());
    System.out.print("Enter hourly pay rate: ");
    employeeOne.setHourlyPayRate(keyboard.nextDouble());
    keyboard.nextLine();
    System.out.print("Enter hours worked: ");
    employeeOne.setHoursWorked(keyboard.nextDouble());
    keyboard.nextLine();
    System.out.print("Enter employee name: ");
    employeeTwo.setName(keyboard.nextLine());
    System.out.print("Enter hourly pay rate: ");
    employeeTwo.setHourlyPayRate(keyboard.nextDouble());
    System.out.print("Enter hours worked: ");
    employeeTwo.setHoursWorked(keyboard.nextDouble());

    System.out.println(employeeOne);
    System.out.println("Employee " + employeeTwo.getEmployeeName() + " has a gross pay of " +employeeTwo.employeesGrossPay() + "$");

  }
}
