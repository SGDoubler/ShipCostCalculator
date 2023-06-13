import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How much is your item: $");
        double itemPrice = in.nextDouble();
        double shippingCost = itemPrice * .02;
        double totalCost = itemPrice + shippingCost;

        if (itemPrice >= 100)
        {
            System.out.println("Shipping is free, your total cost is: $" + itemPrice);
        }
        else
        {
            System.out.println("Shipping is: $" + shippingCost);
            System.out.println("Your total cost is $" + totalCost);
        }
    }
}