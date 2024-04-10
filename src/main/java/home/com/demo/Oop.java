package home.com.demo;

import home.com.demo.data.Card;
import home.com.demo.data.MasterCard;

public class Oop {

    public static void main(String[] args) {

        Card masterCard = new MasterCard();
        masterCard.setBalance(100);
        System.out.println(masterCard.getPaymentSystem());

    }
}
