package Task7;

public class PlatinumCard extends Card{

    public PlatinumCard(double interestRate, String cardType) {
        super(interestRate, cardType);
    }

    @Override
    public void fulfillBalance() {
        System.out.println("Your balance was updated, thank you for using Platinum Card!");
    }

    @Override
    public void payBills() {
        System.out.println("You payed your bills using Platinum card");
    }
}
