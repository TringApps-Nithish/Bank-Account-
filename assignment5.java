/*3. Design a class for a basic credit card. The class should have the following features:
    - Instance variables for the cardholder's name, card number, and expiration date.
    - A constructor that allows the user to create a credit card with a given name, card number, and expiration date.
    - An equals method that returns true if the given object is a credit card with the same card number, and false otherwise.
    - A clone method that creates and returns a new credit card with the same name, card number, and expiration date as the original credit card." */

import java.util.*;

class card {
    public static void main(String args[]) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n ----- Creadit Card Details Using Cloning ----- \n\n");
        System.out.printf(" Enter 1st Card Deatils : \n");
        System.out.printf("\n Enter Card Holder Name : ");
        String name = sc.nextLine();
        System.out.printf(" Enter Card Number : ");
        int cardno = sc.nextInt();
        System.out.printf(" Enter Card Expiry Date : ");
        String expdate = sc.next();
        carddetails obj = new carddetails(name, cardno, expdate);
        carddetails obj1 = (carddetails) obj.clone();

        System.out.printf("\n Enter 2nd Card Deatils : \n");
        System.out.printf("\n Enter Card Holder Name : ");
        String name2 = sc.next();
        System.out.printf(" Enter Card Number : ");
        int cardno2 = sc.nextInt();
        System.out.printf(" Enter Card Expiry Date : ");
        String expdate2 = sc.next();
        carddetails obj2 = new carddetails(name2, cardno2, expdate2);

        System.out.printf("\n Members of Cloned Object ->  ");
        obj1.display();
        System.out.printf("\n Members of Object - 2 -> ");
        obj2.display();
        boolean ans = obj1.equals(cardno, cardno2);
        if (ans)
            System.out.printf("\n\t------ Both Card Number Are Same ------");
        else
            System.out.printf("\n\t------ Both Card Number are Not Same ------");
    }
}

class carddetails implements Cloneable {
    int cardno1;
    String name1, expdate1;

    carddetails(String name, int cardno, String expdate) {
        name1 = name;
        cardno1 = cardno;
        expdate1 = expdate;
    }

    public Object clone() throws CloneNotSupportedException

    {
        System.out.printf("\n Object has been Cloned Successfully ....\n");
        return super.clone();
    }

    boolean equals(int cardno, int cardno2) {
        boolean result = (cardno1 == cardno) ? true : false;
        return result;
    }

    void display() {
        System.out.printf("\n\t\t------ Credit card Details ------");
        System.out.println(" \n Card Holder Name : " + name1 + "\n Card Number : " + cardno1 + "\n Card Expiry Date : "
                + expdate1);
    }

}
