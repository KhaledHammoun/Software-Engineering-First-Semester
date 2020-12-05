import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookClassTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    List<Book> books = new ArrayList<Book>();
    System.out.print("Enter details: ");
    String input = keyboard.nextLine();

    while (!input.equals("End"))
    {
      String[] tokens = input.split(", ");
      Book bookToAdd = new Book(tokens[0],
                                tokens[1],
                                Double.parseDouble(tokens[2]),
                                Integer.parseInt(tokens[3]));
      books.add(bookToAdd);
      System.out.print("Enter details: ");
      input = keyboard.nextLine();
    }

    for (Book book : books)
    {
      double newPrice = book.getPrice() * 0.8;
      book.setPrice(newPrice);
    }

    for (Book book : books)
    {
      System.out.println(book);
    }

  }
}
