package home.com.demo.data;

public class VisaCard extends Card {

    public  VisaCard() {
        super(PaymentSystem.VISA);
    }
    @Override
    public void payInCountry(Country country, int amount) {

    }
}
