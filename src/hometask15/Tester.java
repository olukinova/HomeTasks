package hometask15;

public class Tester extends FullTimeEmployee{

    boolean employeeTested;

    Tester (String name, String lastName, String position, int yearStarted, double annualSalary,
                     boolean consentSigned, boolean agreedOvertime, boolean employeeTested) {
        super(name, lastName, position, yearStarted, annualSalary, consentSigned, agreedOvertime);
        this.employeeTested = employeeTested;
    }

    void test () {
        System.out.println("This is tester class for employees");
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Ivan", "Ivanov", "cook", 2022, 55000);
        emp.askSalaryIncrease();
        emp.quitJob();
        emp.printInfo();

        System.out.println("****************");

        PartTimeEmployee partEmp = new PartTimeEmployee("Ivan", "Ivanov", "cook", 2022,
                55000, true, false, 14);
        partEmp.askOvertime();
        partEmp.askSalaryIncrease();
        partEmp.quitJob();
        partEmp.printInfo();

        System.out.println("****************");

        FullTimeEmployee fullEmp = new FullTimeEmployee("Ivan", "Ivanov", "cook", 2022,
                55000, true, false);
        fullEmp.askSalaryIncrease();
        fullEmp.quitJob();
        fullEmp.refuseOvertime();
        fullEmp.printInfo();

        System.out.println("****************");

        Tester test = new Tester("Ivan", "Ivanov", "cook", 2022,
                55000, true, false,  true);
        test.quitJob();
        test.askSalaryIncrease();
        test.refuseOvertime();
        test.test();
        test.printInfo();



    }
}
