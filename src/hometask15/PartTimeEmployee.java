package hometask15;

public class PartTimeEmployee extends Employee{

    boolean consentSigned;
    boolean agreedOvertime;
    int hoursPerWeek;

   PartTimeEmployee(String name, String lastName, String position, int yearStarted, double annualSalary,
                     boolean consentSigned, boolean agreedOvertime, int hoursPerWeek) {
        super(name, lastName, position, yearStarted, annualSalary);
        this.consentSigned = consentSigned;
        this.agreedOvertime = agreedOvertime;
        this.hoursPerWeek = hoursPerWeek;
    }

    void askOvertime() {
        System.out.println("I'd like to work overtime this week");
    }

    @Override
    void printInfo() {
        System.out.println(name + " "+ lastName + " started working in " + yearStarted + " and has annual income "
                + annualSalary);
        System.out.println("Employee signed consent: " + consentSigned);
        System.out.println("Employee agreed to work overtime: " + agreedOvertime);
        System.out.println("Employee works: " + hoursPerWeek + " hours per week");
    }

}
