package hometask20.Task2;

import java.util.*;

public class PersonTester{
    public static void main(String[] args) {

        Map<String, hometask20.Task2.Person> employees = new TreeMap<>();
        employees.put("ID1234567", new hometask20.Task2.Person("John", "Snow", 100000.00, 35));
        employees.put("ID1234568", new hometask20.Task2.Person("Bart", "Simpson", 50000.00, 19));
        employees.put("ID1234569", new hometask20.Task2.Person("Chandler", "Bing", 150000.00, 28));
        employees.put("ID1234566", new hometask20.Task2.Person("Phoeby", "Buffey", 35000.00, 33));

        //Set<Map.Entry<String, Person>> empSet = employees.entrySet();

        for (Map.Entry<String, hometask20.Task2.Person> entry : employees.entrySet()) {

            //System.out.println(entry);
            String id = entry.getKey();
            hometask20.Task2.Person employee = entry.getValue();
            System.out.println("Person with ID " + id + ": ");
            employee.display();

        }
    }
    }

