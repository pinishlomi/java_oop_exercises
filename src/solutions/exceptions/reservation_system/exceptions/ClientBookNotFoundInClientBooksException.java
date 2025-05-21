package solutions.exceptions.reservation_system.exceptions;

public class ClientBookNotFoundInClientBooksException extends GeneralException {

	public ClientBookNotFoundInClientBooksException(String clientName, String bookName) {
		super("Client book not found in client's books, " + clientName 
				+ ": you don't have book: '" + bookName + "'");
	}
}
