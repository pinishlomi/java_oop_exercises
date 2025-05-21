package solutions.exceptions.reservation_system.exceptions;

public class ClientBookLimitException extends GeneralException {

	public ClientBookLimitException(String clientName, String bookName) {
		super("Client book limit, " + clientName + ": you already have book: " + bookName);
	}
}
