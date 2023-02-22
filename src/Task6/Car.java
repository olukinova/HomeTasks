package Task6;

public class Car extends Insurance{
    String carModel;

    Car(String carModel, String insuranceName) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("I had an insurance case, you need to pay to repair my " + carModel);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("I want to switch a provider for my " + carModel);
    }
}
