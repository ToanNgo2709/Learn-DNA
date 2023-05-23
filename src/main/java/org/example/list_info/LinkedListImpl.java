package org.example.list_info;

public class LinkedListImpl {

    public static void main(String[] args) {
        Employee toanNgo = new Employee(1, "Toan", "Ngo");
        Employee johnDoe = new Employee(2, "John", "Doe");
        Employee maxHere = new Employee(3, "Max", "Here");

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(toanNgo);
        list.addToFront(johnDoe);
        list.addToFront(maxHere);

        list.printList();
    }
}
