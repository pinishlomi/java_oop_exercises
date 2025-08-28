package starters.exceptions.classroom_grades;

import java.util.Arrays;

public class Classroom {
    private final String teacherName;
    private final int[] grades;
    private int numOfGrades;

    public Classroom(String teacherName, int maxStudents) {
        this.teacherName = teacherName;
        grades = new int[maxStudents];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Classroom with the teacher ");
        sb.append(teacherName)
                .append(", with ")
                .append(grades.length)
                .append(" students in the class, has ")
                .append(numOfGrades).append(" grades: [");
        for (int i = 0; i < numOfGrades; i++) {
            sb.append(grades[i]);
            if (i < numOfGrades - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public void setGrades(int[] newGrades)  {
        // TODO implement your code

    }

    public int getGrade(int index)  {
        // TODO implement your code
        return 0;
    }
}










