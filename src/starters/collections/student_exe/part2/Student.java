package starters.collections.student_exe.part2;

import java.util.Map;

public class Student {
    private String id;
    private String name;
    private final double gpa;

    public Student(String id, String name, double gpa, Map<COURSES, Double> courses) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Student s) {
            return s.id.equals(id);
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name).append(", gpa: ").append(gpa).append("\n");
        return sb.toString();
    }
}
