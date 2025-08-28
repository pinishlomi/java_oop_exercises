package starters.programing_company;

public enum CompanyStatus {
    LANGUAGE_NO_ROOM("There is not enough space to" +
            " add a language to the array."),
    LANGUAGE_ALREADY_EXIST("Language already exists."),
    SUCCESS("Action success");

    private final String description;

    CompanyStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
