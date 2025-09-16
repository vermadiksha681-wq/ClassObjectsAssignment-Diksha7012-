// Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.
import java.util.Scanner;
public class Book {
    Scanner sc = new Scanner(System.in);
    String Title;
    String author;
    int Price;
    void getDetails() 
    {

        System.out.println("EnterTitle");
        Title = sc.nextLine();

        System.out.println("Enter Author name");
        author  = sc.nextLine();

        System.out.println("Enter price of book");
        Price = sc.nextInt();
        
    }
    void DisplayDetails()
    {
        System.out.println("title of book: " + Title);
        System.out.println("name of author: " + author);
        System.out.println("book price " + Price);

    }
    public static void main(String args[])
    {
        Book obj = new Book();
        obj.getDetails();
        obj. DisplayDetails();
    }
}
