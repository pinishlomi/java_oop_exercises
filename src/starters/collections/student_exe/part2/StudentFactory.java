package starters.collections.student_exe.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class StudentFactory {
    private static final Random r = new Random();
    private static final String[] FIRST_NAMES = {"Noam", "Yael", "Avi", "Eli", "Maya", "Omer", "Tali", "Uri", "Roni", "Adi"};
    private static final String[] LAST_NAMES = {"Cohen", "Levi", "Ben David", "Avrahami", "Katz", "Mizrachi", "Biton", "Azoulay", "Dahan", "Tal"};

    public static List<Student> createStudents(int count) {
        List<Student> students = new ArrayList<>();
        return students;
    }

    private static Student createStudent() {
        Map<COURSES, Double> courses = generateCourses();
        double gpa = StudentUtils.getAverage(courses);
        return new Student(generateId(), generateName(), gpa, courses);
    }

    private static String generateId() {
        StringBuilder sb = new StringBuilder();
        sb.append(r.nextInt(90000000) + 10000000);
        if (sb.length() > 8) {
            System.out.println(sb);
        }
        int checkDigits = 0, weight;
        for (int i = 0; i < sb.length(); i++) {
            weight = Character.getNumericValue(sb.toString().charAt(i)) * (i % 2 + 1);
            checkDigits += weight % 10 + weight / 10;
        }
        checkDigits = (10 - checkDigits % 10) % 10;
        sb.append(checkDigits);
        return sb.toString();
    }

    private static String generateName() {
        String firstName = FIRST_NAMES[r.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[r.nextInt(LAST_NAMES.length)];
        return firstName + " " + lastName;
    }

    private static Map<COURSES, Double> generateCourses() {
        return null;
    }

}
