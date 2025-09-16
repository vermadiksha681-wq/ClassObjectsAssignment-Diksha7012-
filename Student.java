/* Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
 */  
import java.util.*;
public class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    int rollNumber;
    double marks;

    void get() {
        System.out.print("Enter the name of student:");
        name = sc.next();

        System.out.print("Enter the roll number of student:");
        rollNumber = sc.nextInt();

        System.out.print("Enter the marks of student:");
        marks = sc.nextDouble();

    }

    void calculateGrade() {
        if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks > 70 && marks <= 79) {
            System.out.println("Grade B");
        } else if (marks > 60 && marks <= 69) {
            System.out.println("Grade C");
        } else if (marks > 50 && marks <= 59) {
            System.out.println("Grade D");
        } else if (marks > 40 && marks <= 49) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade R");
        }
    }

    void display() {
        System.out.println("Name of the student:" + name);
        System.out.println("Roll number of student:" + rollNumber);
        System.out.println("Marks of student:" + marks);
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.get();

        s.display();
        s.calculateGrade();
    }

}