import java.util.Scanner;

public class StockTransactionProgram
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Shares bought: ");
    int sharesBought = keyboard.nextInt();
    System.out.print("Stock price buy: ");
    double pricePerShareBuy = keyboard.nextDouble();
    System.out.print("Shares sold: ");
    int sharesSold = keyboard.nextInt();
    System.out.print("Stock price sell: ");
    double pricePerShareSell = keyboard.nextDouble();
    System.out.print("Broker commission: ");
    double brokerCommission = keyboard.nextDouble();

    double totalPaid = sharesBought * pricePerShareBuy;
    double commissionBuy = totalPaid * (brokerCommission/100);
    double totalSell = sharesBought * pricePerShareSell;
    double commissionSell = totalSell * (brokerCommission/100);

    double profit = (totalSell - commissionSell) - (totalPaid + commissionBuy);

    System.out.println(totalPaid);
    System.out.println(commissionBuy);
    System.out.println(totalSell);
    System.out.println(commissionSell);
    System.out.println(profit);
  }
}
