package org.kedar.java10;

import org.kedar.domain.Employee;

public class VarSample {
    public static void main(String[] args) {
        var obj = "kedar";
        System.out.println(obj.getClass());

        var obj1 = 1.0;
        System.out.println(obj1);
        //System.out.println(obj1.getClass());
        //compile error

        var obj2 = Employee.listOfEmployees.get(0);
        System.out.println(obj2.getClass());
    }
}
