//  Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object.
import java.util.Scanner;
public class MobilePhone {
    Scanner sc = new Scanner(System.in);
    String brand;
    String model;
    int price;
    void getDetails() 
    {
    
        System.out.println("Enter brand name ");
        brand = sc.nextLine();

        System.out.println("Enter model");
        model  = sc.nextLine();

        System.out.println("Enter price");
        price = sc.nextInt();
        
    }
    void DisplayDEtails()
    {
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("price: " + price);

    }
    public static void main(String args[])
    {
         MobilePhone obj = new MobilePhone();
        obj.getDetails();
        obj. DisplayDEtails();
    }
}