package starters.collections.student_exe.part2;

import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        // part 2
        List<Student> students = StudentFactory.createStudents(10);
        System.out.println("Students: " + students.size());
        printStudents(students);

        Map<COURSES, List<Student>> studentsByCourse = StudentUtils.getStudentsByCourse(students);
        System.out.println("\nStudents list by course:");
        printStudentsByCourse(studentsByCourse);

        Map<COURSES, Double> gpaByCourse = StudentUtils.getGpaByCourse(studentsByCourse);
        System.out.println("\nGpa by course:");
        printGpaByCourse(gpaByCourse);
    }

    public static void printStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void printStudentsByCourse(Map<COURSES, List<Student>> studentsByCourse) {
        for (Map.Entry<COURSES, List<Student>> entry : studentsByCourse.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            for (Student student : entry.getValue()) {
                System.out.println("\t" + student.getName());
            }
        }
    }

    public static void printGpaByCourse(Map<COURSES, Double> gpaByCourse) {
        for (Map.Entry<COURSES, Double> entry : gpaByCourse.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
/*
Students: 10
211159686: Yael Mizrachi, gpa: 78.4
C: 87.0
MATH_1: 66.0
JAVA_OOP: 59.0
JAVA: 99.0
PYTHON: 81.0

746445980: Omer Levi, gpa: 79.67
C: 97.0
MATH_1: 83.0
PYTHON_OOP: 64.0
JAVA: 84.0
PYTHON: 67.0
MATH_2: 83.0

623982253: Yael Azoulay, gpa: 82.25
JAVA_OOP: 76.0
PYTHON_OOP: 88.0
JAVA: 90.0
PYTHON: 75.0

780382040: Avi Levi, gpa: 84.0
MATH_1: 57.0
PYTHON_OOP: 91.0
JAVA: 89.0
PYTHON: 87.0
MATH_2: 96.0

426949848: Tali Ben David, gpa: 68.33
C: 90.0
JAVA_OOP: 63.0
PYTHON_OOP: 52.0

432835536: Adi Levi, gpa: 74.5
MATH_1: 91.0
PYTHON_OOP: 63.0
JAVA: 64.0
PYTHON: 80.0

933581340: Maya Dahan, gpa: 81.4
MATH_1: 84.0
JAVA_OOP: 98.0
PYTHON_OOP: 86.0
JAVA: 50.0
PYTHON: 89.0

660998741: Yael Ben David, gpa: 57.25
C: 52.0
MATH_1: 67.0
PYTHON_OOP: 50.0
JAVA: 60.0

327358578: Adi Levi, gpa: 73.75
MATH_1: 81.0
JAVA_OOP: 83.0
PYTHON_OOP: 68.0
PYTHON: 63.0

144645751: Tali Azoulay, gpa: 72.5
C: 88.0
JAVA: 50.0
PYTHON: 97.0
MATH_2: 55.0


Students list by course:
C: 5
	Yael Mizrachi
	Omer Levi
	Tali Ben David
	Yael Ben David
	Tali Azoulay
MATH_1: 7
	Yael Mizrachi
	Omer Levi
	Avi Levi
	Adi Levi
	Maya Dahan
	Yael Ben David
	Adi Levi
JAVA_OOP: 5
	Yael Mizrachi
	Yael Azoulay
	Tali Ben David
	Maya Dahan
	Adi Levi
PYTHON_OOP: 8
	Omer Levi
	Yael Azoulay
	Avi Levi
	Tali Ben David
	Adi Levi
	Maya Dahan
	Yael Ben David
	Adi Levi
JAVA: 8
	Yael Mizrachi
	Omer Levi
	Yael Azoulay
	Avi Levi
	Adi Levi
	Maya Dahan
	Yael Ben David
	Tali Azoulay
PYTHON: 8
	Yael Mizrachi
	Omer Levi
	Yael Azoulay
	Avi Levi
	Adi Levi
	Maya Dahan
	Adi Levi
	Tali Azoulay
MATH_2: 3
	Omer Levi
	Avi Levi
	Tali Azoulay

Gpa by course:
C: 82.8
MATH_1: 75.57
JAVA_OOP: 75.8
PYTHON_OOP: 70.25
JAVA: 73.25
PYTHON: 79.88
MATH_2: 78.0
 */