package hometask19.Task7;

abstract class Card {

    double interestRate;
    String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    public abstract void fulfillBalance();
    public abstract void payBills();

}
