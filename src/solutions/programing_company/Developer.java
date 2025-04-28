package solutions.programing_company;

import static solutions.programing_company.CompanyStatus.*;

public class Developer extends Employee {
    private static final float RAISE_FACTOR = 1.1f;
    private static final int MAX_LANGS = 6;
    private final String[] progLangs;
    private int numOfLangs;

    public Developer(String firstname, String lastname, float salary) {
        super(firstname, lastname, salary);
        progLangs = new String[MAX_LANGS];
    }

    public CompanyStatus addLang(String lang) {
        if (numOfLangs == MAX_LANGS) {
            return LANGUAGE_NO_ROOM;
        }
        if (langExist(lang)) {
            return LANGUAGE_ALREADY_EXIST;
        }
        progLangs[numOfLangs++] = lang;
        return SUCCESS;
    }

    private boolean langExist(String lang) {
        for (int i = 0; i < numOfLangs; i++) {
            if (progLangs[i].equals(lang)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void applyRaise() {
        salary *= RAISE_FACTOR;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\n\tProgramming languages:");
        sb.append("[");
        for (int i = 0; i < numOfLangs; i++) {
            sb.append(progLangs[i]);
            if (i < numOfLangs - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return  sb.toString();
    }
}
