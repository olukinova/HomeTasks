package hometask15;

public class Employee {
    String name, lastName, position;
    int yearStarted;
    double annualSalary;

    Employee(String name, String lastName, String position, int yearStarted, double annualSalary) {
        this.name = name;
        this.position = position;
        this.yearStarted = yearStarted;
        this.annualSalary = annualSalary;
        this.lastName = lastName;
    }

    void askSalaryIncrease () {
        System.out.println("Could you please increase my salary");
    }

    void quitJob() {
        System.out.println("Today is my last day in your company");
    }

    void printInfo() {
        System.out.println(name + " "+ lastName + " started working in " + yearStarted + " and has annual income " + annualSalary);
    }

}
