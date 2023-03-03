package hometask20;

import java.util.HashMap;
import java.util.*;

public class Task3 {


    // Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets
    // the highest salary. Output should be in the below format
    //John Smith=$100000

    public static void main(String[] args) {

        Map<String, Integer> employees = new HashMap<>();

        employees.put("Monica Geller", 70000);
        employees.put("Rachel Green", 65000);
        employees.put("Chandler Bing", 120000);
        employees.put("Phoeby Buffey", 45000);
        employees.put("Ross Geller", 110000);
        employees.put("Joe Tribbiani", 35000);

        int maxSalary = 0;
        String highestPayedEmployee = "";

         for(Map.Entry<String, Integer> entry: employees.entrySet()) {
            String name =  entry.getKey();
            Integer salary = entry.getValue();

            if(salary > maxSalary) {
                maxSalary = salary;
                highestPayedEmployee = name;
            }
        }

        System.out.println(highestPayedEmployee + "=" + maxSalary);


    }
}
