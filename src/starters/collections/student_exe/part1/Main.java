package starters.collections.student_exe.part1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // part 1
        List<Student> students = StudentFactory.createStudents(10);
        System.out.println("Students: " + students.size());
        printStudents(students);

        List<Student> topStudents = StudentUtils.getTopStudents(students, 80);
        System.out.println("\nTop students: " + topStudents.size());
        printStudents(topStudents);

        StudentUtils.removeStudents(students, 60);
        System.out.println("\nStudents After removing: " + students.size());
        printStudents(students);
    }

    public static void printStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
/*
Students: 10
468349857: Yael Levi, gpa: 86.0
861536456: Adi Katz, gpa: 65.0
586505489: Noam Ben David, gpa: 54.0
327623617: Tali Katz, gpa: 100.0
199991266: Roni Mizrachi, gpa: 82.0
516281409: Tali Azoulay, gpa: 54.0
168088318: Noam Levi, gpa: 99.0
699340626: Maya Katz, gpa: 84.0
774955652: Tali Biton, gpa: 93.0
162124283: Tali Levi, gpa: 69.0

Top students: 6
468349857: Yael Levi, gpa: 86.0
327623617: Tali Katz, gpa: 100.0
199991266: Roni Mizrachi, gpa: 82.0
168088318: Noam Levi, gpa: 99.0
699340626: Maya Katz, gpa: 84.0
774955652: Tali Biton, gpa: 93.0

Students After removing: 8
468349857: Yael Levi, gpa: 86.0
861536456: Adi Katz, gpa: 65.0
327623617: Tali Katz, gpa: 100.0
199991266: Roni Mizrachi, gpa: 82.0
168088318: Noam Levi, gpa: 99.0
699340626: Maya Katz, gpa: 84.0
774955652: Tali Biton, gpa: 93.0
162124283: Tali Levi, gpa: 69.0
 */
