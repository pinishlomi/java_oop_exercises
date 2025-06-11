package starters.collections.student_exe.part1;

public class Student {

    private String id;
    private String name;
    private final double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return id + ": " + name + ", gpa: " + gpa;
    }
}
