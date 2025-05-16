package solutions.exceptions.classroom_grades;

public class TooManyGradesException extends GradesException {
	public TooManyGradesException(int maxGrades, int numOfGrades, int givenGrades) {
		super("Error: Too many grades: tried to add " 
				+ givenGrades  + " grades to existing " 
				+ numOfGrades + " while there can be only " 
				+ maxGrades + " grades");
	}
}
