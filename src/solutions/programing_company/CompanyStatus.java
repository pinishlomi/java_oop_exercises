package solutions.programing_company;

public enum CompanyStatus {
    LANGUAGE_NO_ROOM("There is not enough space to add a language to the array."),
    LANGUAGE_ALREADY_EXIST("Language already exist."),
    EMPLOYEES_NO_ROOM("There is not enough space to add a employee to the array."),
    EMPLOYEE_ALREADY_EXIST("Employee already exist."),
    SUCCESS("Action success");

    private final String description;
    CompanyStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
