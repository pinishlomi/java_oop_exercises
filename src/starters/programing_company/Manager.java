package starters.programing_company;

import static starters.programing_company.CompanyStatus.*;

public class Manager extends Employee{
    private static final float RAISE_FACTOR = 1.15f;
    private static final int MAX_EMPLOYEES = 10;
    private  Employee[] employees;
    private int numOfEmployees;

    public Manager(String firstname, String lastname, float salary) {
        super(firstname, lastname, salary);
        employees = new Employee[MAX_EMPLOYEES];
    }

    public void applyAllRaise() {
        for (int i = 0; i < numOfEmployees; i++) {
            employees[i].applyRaise();
        }
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\n");
        if (numOfEmployees == 0) {
            return sb.append("\t").append("No employees yet\n").toString();
        }
        for (int i = 0; i < numOfEmployees; i++) {
            sb.append("\t").append(employees[i].getName()).append("\n");
        }
        return  sb.toString();
    }
}

