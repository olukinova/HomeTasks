package Task7;

public class DebitCard extends Card{

    public DebitCard(double interestRate, String cardType) {
        super(interestRate, cardType);
    }

    public void fulfillBalance() {
        System.out.println("Your balance was fulfilled");
    }

    public void payBills() {
        System.out.println("Your bills were payed");
    }

}
