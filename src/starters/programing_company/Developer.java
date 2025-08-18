package starters.programing_company;

import static starters.programing_company.CompanyStatus.*;

public class Developer {
    private static final float RAISE_FACTOR = 1.1f;
    private static final int MAX_LANGS = 6;
    private String[] progLangs;
    private int numOfLangs;

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
