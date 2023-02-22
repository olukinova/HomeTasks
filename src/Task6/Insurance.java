package Task6;

abstract public class Insurance {

    protected String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public abstract void getQuote();

    public abstract void cancelInsurance();
}
