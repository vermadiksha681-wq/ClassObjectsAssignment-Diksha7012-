/* Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
 */
import java.util.Scanner;
public class BankAccount {
    Scanner sc = new Scanner(System.in);
    String accountHolder;
    int accountNumber;
    double balance;
    int depositamount;
    int withdrawamount;
    void get(){
    System.out.println("Enter account holder");
    accountHolder = sc.next();
    System.out.println("Enter account number");
    accountNumber = sc.nextInt();
    System.out.println("Enter balance");
    balance = sc.nextDouble();
    System.out.println("enter the amount you want to deposit ");
    depositamount = sc.nextInt();
    System.out.println("Enter the amount you want to withdraw ");
    withdrawamount = sc.nextInt();
    }

    void depositingMoney()
    {
       if(depositamount>0)
       {
        balance = depositamount+balance;
        System.out.println("updated balance: " + balance);
       }
       else{
        System.out.println("amount should be positive");
       }
    }
    void withdrawingMoney()
    {
        if(withdrawamount<=0)
        {
          System.out.println("Enter positive amount");        
        }
        else if(withdrawamount>balance)
        {
            System.out.println("insufficient balance");
        }
       else {
        balance = balance-withdrawamount;
        System.out.println("current balance: " + balance);
       }
      
    }
    public static void main(String args[])
    {
        BankAccount obj = new BankAccount();
        obj.get();
        obj.depositingMoney();
        obj.withdrawingMoney();

    }
}
