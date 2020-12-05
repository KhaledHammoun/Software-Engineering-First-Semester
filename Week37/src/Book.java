public class Book
{
  private String author;
  private String title;
  private double price;
  private  int pages;

  public Book()
  {
    author = "";
    title = "";
    price = 0;
    pages = 0;
  }

  public Book(String author, String title, double price, int pages)
  {
    this.author = author;
    this.title = title;
    this.price = price;
    this.pages = pages;
  }

  public String getAuthor()
  {
    return author;
  }

  public String getTitle()
  {
    return title;
  }

  public double getPrice()
  {
    return price;
  }

  public int getPages()
  {
    return pages;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public String toString()
  {
    return "Book details: \n\t" +
                          author + "\n\t" +
                          title + "\n\t" +
                          price + "\n\t" +
                          pages;
  }
}

