package solutions.exceptions.classroom_grades;

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

    @Override
    public boolean equals(Object other) {
        if (other instanceof Classroom c) {
            return Arrays.equals(grades, c.grades);
        }
        return false;
    }

    public void setGrades(int[] newGrades) throws TooManyGradesException, OutOfRangeGradeException {
        if (grades.length - numOfGrades < newGrades.length) {
            throw new TooManyGradesException(newGrades.length, numOfGrades, grades.length);
        }
        for (int newGrade : newGrades) {
            if (newGrade < 0 || newGrade > 100) {
                throw new OutOfRangeGradeException();
            }
            grades[numOfGrades++] = newGrade;
        }
    }

    public int getGrade(int index) throws GradeNotExistException, IndexOutOfBoundsException {
        if (index < 0 || index >= grades.length)
            throw new IndexOutOfBoundsException(index);
        if (index >= numOfGrades)
            throw new GradeNotExistException(index);
        return grades[index];
    }
}










