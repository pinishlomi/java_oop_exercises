package starters.java_interfaces.exe;

public class Student extends Person {
	
	private double avgGrade;

	public Student(String id, String firsname, String lastname, int age, double avgGrade) {
		super(id, firsname, lastname, age);
		this.avgGrade = avgGrade;
	}

	public Student(Student other) {
		super(other);
		this.avgGrade = other.avgGrade;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + avgGrade;
	}

}
