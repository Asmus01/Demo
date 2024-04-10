package home.com.oop;

import home.com.oop.data.Card;
import home.com.oop.data.MasterCard;
import home.com.oop.data.VisaCard;

public class Oop {

    public static void main(String[] args) {

        Card masterCard = new MasterCard();
        masterCard.setBalance(100);
        System.out.println(masterCard.getPaymentSystem());

    }
}
