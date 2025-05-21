package solutions.exceptions.reservation_system.exceptions;

public class BookNotFoundException extends GeneralException {

	public BookNotFoundException(String bookName) {
		super("Book: '" + bookName + "' not found");
	}

}
