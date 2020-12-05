import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Invoice
{
  private double totalPrice;
  private Customer customer;
  private ArrayList<Item> items;

  public Invoice(Customer customer)
  {
    totalPrice = 0;
    this.customer = customer;
    items = new ArrayList<>();
  }

  public void addItem(Item item)
  {
    totalPrice += item.getPrice();
    items.add(item);
  }

  public void removeItem(Item item)
  {
    totalPrice -= item.getPrice();
    items.remove(item);
  }

  public double getTotalPrice()
  {
    return totalPrice;
  }

  public int getNumberOfItems()
  {
    int counter = 0;
    for (Item item : items)
    {
      if (item != null)
        counter++;
    }
    return counter;
  }

  public Item[] getListOfItems()
  {
    ArrayList<Item> temp = new ArrayList<>();
    for (Item item : items)
    {
      if (item != null)
        temp.add(item);
    }
    return temp.toArray(new Item[0]);
  }

  public Item[] getListOfFragileItems()
  {
    ArrayList<Item> temp = new ArrayList<>();
    for (Item item : items)
    {
      if (item.isFragile())
        temp.add(item);
    }
    return temp.toArray(new Item[0]);
  }

  public Item[] getListOfSortedItems()
  {
    ArrayList<Item> temp = new ArrayList<>();
    for (Item item : items)
    {
      if (item != null)
        temp.add(item);
    }
    temp.sort((x, y) -> Double.compare(x.getPrice(), y.getPrice()));

    /*Collections.sort(temp, new Comparator<Item>()
    {
      @Override public int compare(Item o1, Item o2)
      {
        return Double.compare(o2.getPrice(), o1.getPrice());
      }
    });*/
    return temp.toArray(new Item[0]);
  }

  public String getCustomerType()
  {
    return customer.getType();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Invoice))
      return false;

    var other = (Invoice)obj;
    return this.customer.equals(other.customer)
        && this.items.equals(other.items)
        && this.totalPrice == other.totalPrice;
  }

  public String toString()
  {
    return customer + " " + " total price of the items = " + totalPrice;
  }

  /*public static void main(String[] args)
  {
    Customer testCustomer = new Person("Khaled", "Horsens", 1234);
    Invoice testInvoice = new Invoice(testCustomer);

    testInvoice.addItem(new Item(2.2, true));
    testInvoice.addItem(new Item(2.3, true));
    testInvoice.addItem(new Item(2.8, true));
    testInvoice.addItem(new Item(2.1, true));
    testInvoice.addItem(new Item(2.0, true));
    testInvoice.addItem(new Item(2.4, true));

    Item[] testSorting = testInvoice.getListOfSortedItems();

    for (Item item : testSorting)
    {
      System.out.println(item);
    }
  }*/
}
