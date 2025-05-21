package solutions.exceptions.reservation_system.exceptions;

public class ClientMaxBooksException extends GeneralException {

	public ClientMaxBooksException(String clientName, int numBooks, int maxBooks) {
		super("Client max books, " + clientName + ": you have " + numBooks + " of " + maxBooks );
	}

}
