package hometask19.Task7;

import java.util.ArrayList;
import java.util.Iterator;

public class Tester {

    public static void main(String[] args) {

        ArrayList<Card> cardList = new ArrayList<>();
        cardList.add(new CreditCard(2.0, "Credit Card"));
        cardList.add(new DebitCard(0.0, "Debit Card"));
        cardList.add(new PlatinumCard(0.0, "Platinum Card"));


        // iteration using enhanced for loop

        for(Card card: cardList) {
            card.fulfillBalance();
            card.payBills();
        }

        System.out.println("*********************");
        //iteration using iterator

        Iterator <Card> cardIterator = cardList.iterator();
        while(cardIterator.hasNext()) {
            Card card = cardIterator.next();
            card.payBills();
            card.fulfillBalance();
        }


    }
}
