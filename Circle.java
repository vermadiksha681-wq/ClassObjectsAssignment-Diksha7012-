// Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.
import java.util.Scanner;
public class Circle {
    Scanner sc = new Scanner(System.in);
    double radius;
     double Area;
     double Circumference;
    void get()
    {
    
    System.out.println("Enter a radius");
    radius = sc.nextDouble();
      
    }
   void calculateArea() {
         Area =  Math.PI * radius * radius;
    }
    void calculateCircumference() {
        Circumference =  2 * Math.PI * radius;
    }
   void display() {
        System.out.println("Radius of circle: " + radius);
        System.out.println("Area of circle: " + Area);
        System.out.println("Circumference of circle: " + Circumference);
    }
    public static void main(String[] args) {
       Circle obj = new Circle();
       obj.get();
       obj.calculateArea();
       obj.calculateCircumference();
       obj.display();

    }
}
