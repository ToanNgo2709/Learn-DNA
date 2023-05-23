package org.example.list_info;

import java.util.List;
import java.util.Vector;

public class VectorInfo {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee(1, "Toan", "Ngo"));
        employeeList.add(new Employee(2, "John", "Doe"));

        for(Employee item : employeeList){
            System.out.println(item);
        }
    }
}
