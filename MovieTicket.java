/* Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.
 */
import java.util.*;
public class MovieTicket {
    String moviename;
    int seatNumber=0;
    double price=0;
    String ticketType;
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();

    void get(){
        System.out.print("Enter movie name:");
        moviename=sc.nextLine();

        System.out.print("Enter the type of tickets ie Silver, Gold, Diamond:");
       ticketType=sc.next();

        switch(ticketType.toLowerCase()){
            case "silver":
            seatNumber=rand.nextInt(50)+1;
            price=150;
            break;

            case "gold":
            seatNumber=rand.nextInt(50)+51;
            price=250;
            break;


            case "diamond":
            seatNumber=rand.nextInt(20)+101;
            price=350;
            break;

            default:
            System.out.println("Invalid ticket count...");
        }

    }
    void display(){
        System.out.println("------Ticket Details------");
        System.out.println("Movie Name:" + moviename);
        System.out.println("Ticket type:" + ticketType);
        System.out.println("Seat Number:" + seatNumber);
        System.out.println("Price:" + price);
    }
    
    public static void main(String args[]){
        MovieTicket mt=new MovieTicket();
        mt.get();
        mt.display();
    }
}