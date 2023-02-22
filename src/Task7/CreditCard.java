package Task7;

public class CreditCard extends Card{

    public CreditCard(double interestRate, String cardType) {
        super(interestRate, cardType);
    }

    @Override
    public void fulfillBalance() {
        System.out.println("Your credit card balance was updated");
    }

    @Override
    public void payBills() {
        System.out.println("You payed your bills using your credit card");
    }

}
