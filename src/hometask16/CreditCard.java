package hometask16;

import hometask14.A;

public class CreditCard {
    double balance;
    double interest;

    void calculateInterest(double balance, double interest) {
        System.out.println((balance * interest) / 100);
    }
}

class Visa extends CreditCard {

}

class AX extends CreditCard {
    @Override
    void calculateInterest (double balance, double interest) {
        System.out.println("Your calculated interest is: " + (balance * interest) / 100);
    }
}

class Test {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        Visa vs = new Visa();
        AX ax = new AX();

        cc.calculateInterest(100, 2);
        vs.calculateInterest(200, 2);
        ax.calculateInterest(300, 2);
    }
}
