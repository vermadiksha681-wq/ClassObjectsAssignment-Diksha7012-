/* Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
 */
import java.util.Scanner;
class Cart {
    String itemName;
    double price;
    int quantity;
    Scanner sc = new Scanner(System.in);
    Cart[] cart; 
    int count;  

    void addItems() {
        System.out.print("Enter number of items you want to add: ");
        int n = sc.nextInt();
       
        cart = new Cart[n];
        count = n;

        for (int i = 0; i < n; i++) {
            cart[i] = new Cart();

            System.out.print("Enter item name: ");
            cart[i].itemName = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter price: ");
            cart[i].price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            cart[i].quantity = sc.nextInt();
        }
    }
    void removeItem() {
        if (count == 0) {
            System.out.println("Cart is empty!");
            return;
        }
        System.out.print("\nEnter item name to remove: ");
        String name = sc.nextLine();
        sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (cart[i].itemName.equalsIgnoreCase(name)) {
                found = true;
                System.out.print("Enter quantity to remove: ");
                int qtyToRemove = sc.nextInt();
                sc.nextLine(); 

                if (qtyToRemove >= cart[i].quantity) {
                    for (int j = i; j < count - 1; j++) {
                        cart[j] = cart[j + 1]; 
                    }
                    cart[count - 1] = null;
                    count--;
                    System.out.println(name + " removed completely from cart.");
                } else {
                    cart[i].quantity -= qtyToRemove;
                    System.out.println(qtyToRemove + " " + name + "(s) removed from cart.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart!");
        }
    }
    void displayCart() {
        if (count == 0) {
            System.out.println("\nCart is empty!");
            return;
        }
        double total = 0;
        System.out.println("\n--- Cart ---");
        for (int i = 0; i < count; i++) {
            System.out.println(cart[i].itemName + " - " + cart[i].quantity + " pcs - Total: " + (cart[i].price * cart[i].quantity));
            total += cart[i].price * cart[i].quantity;
        }
        System.out.println("Total Cost = " + total);
    }
}
public class CartItem {
    public static void main(String[] args) {
        Cart myCart = new Cart();
        myCart.addItems();     
        myCart.displayCart();   
        myCart.removeItem();    
        myCart.displayCart();   
    }
}