package hometask15;

public class FullTimeEmployee extends Employee{
    boolean consentSigned;
    boolean agreedOvertime;

    FullTimeEmployee(String name, String lastName, String position, int yearStarted, double annualSalary,
                     boolean consentSigned, boolean agreedOvertime) {
        super(name, lastName, position, yearStarted, annualSalary);
        this.consentSigned = consentSigned;
        this.agreedOvertime = agreedOvertime;
    }

    void refuseOvertime() {
        System.out.println("I will not work overtime this week");
    }

    @Override
    void printInfo() {
        System.out.println(name + " "+ lastName + " started working in " + yearStarted + " and has annual income "
                + annualSalary);
        System.out.println("Employee signed consent: " + consentSigned);
        System.out.println("Employee agreed to work overtime: " + agreedOvertime);
    }

}
