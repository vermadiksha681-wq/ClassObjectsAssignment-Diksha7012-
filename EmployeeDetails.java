// Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
import java.util.Scanner;
public class EmployeeDetails {
    Scanner sc = new Scanner(System.in);
     String name;
    int id;
    int salary;
    void getDetails() 
    {
        
        System.out.println("Enter a name of employee");
        name = sc.next();

        System.out.println("Enter a id of employee");
         id  = sc.nextInt();

        System.out.println("Enter a salary of employee");
         salary = sc.nextInt();
        
    }
    void DisplayDEtails()
    {
        System.out.println("name of employee: " + name);
        System.out.println("name of employee: " + id);
        System.out.println("name of employee: " + salary);

    }
    public static void main(String args[])
    {
         EmployeeDetails obj = new EmployeeDetails();
        obj.getDetails();
        obj. DisplayDEtails();
    }
}