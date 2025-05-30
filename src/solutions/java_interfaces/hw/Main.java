package solutions.java_interfaces.hw;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee[] employees = new Employee[]{
                new Employee("Kobi", 28, 8000),
                new Employee("Dan", 29, 6000),
                new Employee("Taly", 23, 7000)
        };

        sortEmployeesBySalary(employees);
        sortBySeveralAttributes(employees);
        search(employees);
        cloneEmployee(employees[0]);
    }

    private static void sortEmployeesBySalary(Employee[] employees) {
        System.out.println("\nbefore sorting by salary");
        print(employees);
        Arrays.sort(employees);
        System.out.println("\nafter  sorting by salary");
        print(employees);
    }

    private static void sortBySeveralAttributes(Employee[] employees) {
        System.out.println("\nbefore sorting");
        print(employees);
        Arrays.sort(employees, new AgeComparator());
        System.out.println("\nafter sorting by age");
        print(employees);
        Arrays.sort(employees, new SalaryComparator());
        System.out.println("\nafter sorting by salary");
        print(employees);
    }

    private static void search(Employee[] employees) {
        System.out.println("\nBinarySearch");
        Employee e1 = new Employee("Taly", 23, 7000);
        Comparator<Employee> c = new NameComparator();
        Arrays.sort(employees, c);
        int index = Arrays.binarySearch(employees, e1, c);
        System.out.println("Employee " + employees[index] + " found in index " + index);
    }

    private static void cloneEmployee(Employee employee) throws CloneNotSupportedException {
        System.out.println("\nClone employee and change original");
        System.out.println("original before change: " + employee);
        Employee e = employee.clone();
        System.out.println("clone employee: " + e);
        employee.setName("Kobi change");
        System.out.println("\nOriginal employee after change : " + employee);
        System.out.println("Clone employee  after change : " + e);
    }

    private static void print(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
