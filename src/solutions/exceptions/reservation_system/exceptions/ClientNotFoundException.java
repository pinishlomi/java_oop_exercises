package solutions.exceptions.reservation_system.exceptions;

public class ClientNotFoundException extends GeneralException {

	public ClientNotFoundException(String clinteName) {
		super("Client: '" + clinteName + "' not found");
	}
}
