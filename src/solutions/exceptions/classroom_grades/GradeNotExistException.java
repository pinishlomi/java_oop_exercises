package solutions.exceptions.classroom_grades;

public class GradeNotExistException extends GradesException {
	public GradeNotExistException(int index) {
		super("Error: Student at index " + index + " does not have a grade yet");
	}
}
