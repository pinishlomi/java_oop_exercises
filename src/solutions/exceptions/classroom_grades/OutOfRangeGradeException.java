package solutions.exceptions.classroom_grades;

public class OutOfRangeGradeException extends GradesException {
	public OutOfRangeGradeException() {
		super("Error: Grade must be between 0-100");
	}
}
