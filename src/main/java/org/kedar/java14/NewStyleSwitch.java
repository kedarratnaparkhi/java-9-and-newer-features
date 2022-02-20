package org.kedar.java14;

import org.kedar.domain.Employee;

import java.util.List;
import java.util.Random;

public class NewStyleSwitch {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.listOfEmployees;

        Random randomNum = new Random();

        Employee randomEmployee = employeeList.get(randomNum.nextInt(0, employeeList.size()));

        switch(randomEmployee.getName()){
            case "Mohan" -> System.out.println("Name is Mohan");
            case "John" -> System.out.println("Name is John");
            case "Vaibhav" -> System.out.println("Name is Vaibhav");
            case "Amit" -> System.out.println("Name is Amit");
            default -> System.out.println("Name is Alien");
        }

        String nameDesc = switch(randomEmployee.getName()){
            case "Mohan" -> "Name is Mohan";
            case "John" -> "Name is John";
            case "Vaibhav" -> "Name is Vaibhav";
            case "Amit" -> "Name is Amit";
            default -> "Name is Alien";
        };

        System.out.println(nameDesc);
    }
}