package org.kedar.java10;

import org.kedar.domain.Employee;

import java.util.List;


public class CopyOfExample {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.listOfEmployees;


        List<Employee> copyOfList = List.copyOf(employeeList);
        System.out.println("Before: Size of new List: "+copyOfList.size());

        copyOfList.add(employeeList.get(2));
        System.out.println("After: Size of new List: "+copyOfList.size());
    }
}
