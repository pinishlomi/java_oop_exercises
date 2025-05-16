package solutions.exceptions.classroom_grades;

public class IndexOutOfBoundsException extends GradesException {
	public IndexOutOfBoundsException(int index) {
		super("Error: index " + index + " is out of bound of grades array");
	}
}
