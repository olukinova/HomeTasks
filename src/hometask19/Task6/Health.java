package hometask19.Task6;

public class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }
    @Override
    public void getQuote() {
        System.out.println("I have medical issue and need a doctor");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("I want to switch my healthcare insurance provider");
    }
}
