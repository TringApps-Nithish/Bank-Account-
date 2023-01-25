
/*
 * "1. Design a class for a simple bank account. The class should have the  following features:
 * - Instance variables for the account holder's name, account number, and  balance.
 * - A constructor that allows the user to create an account with a given name, account number, and balance.
 * - A method that allows the user to make a deposit to the account.
 * - A method that allows the user to make a withdrawal from the account.
 * - A method that returns the current balance of the account.
 */
import java.util.*;

class details {
    Scanner sc = new Scanner(System.in);
    String holdername;
    int accnum;
    int bal, dpamount, wdamount;

    details(String name, int an) {
        holdername = name;
        accnum = an;
    }

    void deposite() {
        System.out.printf("\nEnter Amount You Want To Deposite : ");
        dpamount = sc.nextInt();
        bal += dpamount;
    }

    void Withdraw() {
        System.out.printf("\nEnter Amount You Want To WithDraw : ");
        wdamount = sc.nextInt();
        bal -= wdamount;
    }

    void balance() {
        System.out.println("\nYour Current Balance : " + bal);
    }

}

class BankAccount {
    public static void main(String[] args) {

        String holdername;
        int accnum, balance, ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Account Holder Name :  ");
        holdername = sc.nextLine();
        System.out.printf("Enter the Account Number :  ");
        accnum = sc.nextInt();

        details ob = new details(holdername, accnum);

        while (ch != 4) {
            System.out.printf(
                    "\nService Provided ....\n 1.Deposite \n 2.Withdraw \n 3.Check Balance \n 4.Exit \n");
            System.out.printf("\nEnter Your Choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:// for deposite
                    ob.deposite();
                    break;

                case 2:// for deposite
                    ob.Withdraw();
                    break;

                case 3:
                    ob.balance();
                    break;

                case 4:
                    System.out.println("\nThanks for Visiting Our Bank.....");
                    break;

                default:
                    System.out.println("\nInvalid Option .....");
                    break;
            }
        }
    }
}