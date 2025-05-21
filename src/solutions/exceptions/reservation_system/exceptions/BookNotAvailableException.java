package solutions.exceptions.reservation_system.exceptions;

public class BookNotAvailableException extends GeneralException {

	public BookNotAvailableException(String bookName) {
		super("Book: '" + bookName + "' not available");
	}
}
