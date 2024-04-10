package home.com.demo.data;

public abstract class Card {

    protected String cardHolder;
    protected int balance;
    protected String cardNumber;
    protected PaymentSystem paymentSystem;

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }



    public Card(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public PaymentSystem getPaymentSystem() {

        return paymentSystem;
    }
    public abstract void payInCountry(Country country, int amount);

    public void setBalance(int i) {
    }
}
