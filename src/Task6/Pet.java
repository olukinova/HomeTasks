package Task6;

public class Pet extends Insurance{
    String petType;

    public Pet(String petType, String insuranceName) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    public void getQuote() {
        System.out.println("My " + petType + " needs a vet");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("I want to switch a provider for my " + petType);
    }
}
