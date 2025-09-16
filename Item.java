// Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.
import java.util.Scanner;
public class Item {
    Scanner sc = new Scanner(System.in);
    int itemCode;
    String itemname;
    int price;
    int quantity;
    void get()
    {
        System.out.println("Enter item code ");
        itemCode = sc.nextInt();
        System.out.println("Enter item name ");
        itemname = sc.next();
        System.out.println("Enter item price ");
        price = sc.nextInt();
        System.out.println("Enter quantity ");
        quantity = sc.nextInt();

    }
     void calculateTotalCost()
    {
       int totalcost = price*quantity;
       System.out.println("total cost " + totalcost);
    }
    void  display()
    {
        System.out.println(" item code "  + itemCode);
        System.out.println(" code name " + itemname);
        System.out.println(" item price " + price);
    }
    public static void main(String args[])
    {
        Item obj = new Item();
        obj.get();
        obj.display();
        obj.calculateTotalCost();
    }
   
}
