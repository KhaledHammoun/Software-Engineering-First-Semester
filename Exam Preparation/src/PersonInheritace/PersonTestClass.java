package PersonInheritace;

import javax.swing.event.DocumentEvent;

public class PersonTestClass
{
  public static void main(String[] args)
  {
    FullDegreeStudent firstStudent = new FullDegreeStudent("Khaled Hammoun",
        "Horsens", "Software Technology Engineering", 1);
    ExchangeStudent secondStudent = new ExchangeStudent("Someone Something",
        "Aarhus", "Mechanical Engineering", "France");

    Teacher firstTeacher = new Teacher("Allan", "Horsens", 1234, "SDJ");
    ITSupporter itSupported = new ITSupporter("Edi Koisi", "Esbjerg", 22123,
        "night");
    HeadOfDepartment chef = new HeadOfDepartment("Bokluk Bokluchev", "Neznam", 1, "STE");

    System.out.println(firstStudent);
    System.out.println(secondStudent);
    System.out.println(firstTeacher);
    System.out.println(itSupported);
    System.out.println(chef);
  }
}
