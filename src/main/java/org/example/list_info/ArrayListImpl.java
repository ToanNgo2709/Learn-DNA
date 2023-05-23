package org.example.list_info;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(1);
        employeeList.add(new Employee(1, "Toan", "Ngo"));
        employeeList.add(new Employee(2, "John", "Doe"));

        for(Employee item : employeeList) {
            System.out.println(item);
        }

        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());
        employeeList.set(1, new Employee(3, "John", "adam"));

        for(Employee item : employeeList) {
            System.out.println(item);
        }
        employeeList.add(0, new Employee(5, "asdfasdf", "adasdfasdf"));

        for(Employee item : employeeList) {
            System.out.println(item);
        }

    }
}
