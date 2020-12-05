public class TestStudentFileAdapter
{
  public static void main(String[] args)
  {
    StudentFileAdapter sfa = new StudentFileAdapter("students.bin");

    // Get all students from the file and print them out
    StudentList list = sfa.getAllStudents();
    System.out.println("All students:");
    System.out.println("------------------------------------------------------------");
    System.out.println(list);

    // Get all Polish students from the file and print them out
    list = sfa.getStudentsFrom("Romania");
    System.out.println("Romanian students:");
    System.out.println("------------------------------------------------------------");
    System.out.println(list);

    // Get all Portuguese students from the file and print them out
    list = sfa.getStudentsFrom("Moldova");
    System.out.println("Moldovan students:");
    System.out.println("------------------------------------------------------------");
    System.out.println(list);

    // Change student's country
    sfa.changeCountry("Alexandru", "Jardan", "Moldova");
    sfa.changeCountry("Andrei", "Soldan", "Moldova");
    sfa.changeCountry("Dan", "Pintea", "Moldova");
    sfa.changeCountry("Dorin", "Pascal", "Moldova");
    sfa.changeCountry("Eduard", "Munteanu", "Moldova");
    sfa.changeCountry("Iana", "Postolachi", "Moldova");

    // Get all Polish students from the file and print them out
    list = sfa.getStudentsFrom("Romania");
    System.out.println("Romanian students:");
    System.out.println("------------------------------------------------------------");
    System.out.println(list);

    // Get all Portuguese students from the file and print them out
    list = sfa.getStudentsFrom("Moldova");
    System.out.println("Moldovan students:");
    System.out.println("------------------------------------------------------------");
    System.out.println(list);
  }
}
