package starters.exceptions.reservation_system;
import starters.exceptions.reservation_system.exceptions.BookNotFoundException;
import starters.exceptions.reservation_system.exceptions.ClientNotFoundException;
import starters.exceptions.reservation_system.exceptions.GeneralException;

public class ReservationSystem {
    private static final int MAX_BOOKS = 30;
    private static final int MAX_CLIENTS = 10;
	
	private final Book[] books;
	private int numOfBooks ;
    private final Client[] clients;
    private int numOfClients;

    public ReservationSystem() {
        this.books = new Book[MAX_BOOKS];
        this.clients = new Client[MAX_CLIENTS];
    }

    public void addBook(Book book) {
        // TODO implement your code

    }

    public void addClient(Client client) {
        // TODO implement your code

    }

    public Book[] getAvailableBooks() {
        // TODO implement your code
        return null;
    }

    public Book[] getReservedBooks() {
        // TODO implement your code
        return null;
    }

    public void reserveBook(String clientName, String bookTitle) {
        // TODO implement your code

    }

    public void returnBook(String clientName, String bookTitle) {
        // TODO implement your code

    }

    private Client findClient(String name)  {
        // TODO implement your code
        return null;
    }

    private Book findBook(String name) {
        // TODO implement your code
        return null;
    }
    
    public String showBooks() {
        StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < numOfBooks; i++) {
			sb.append((i + 1)).append(")\t").append(books[i]).append("\n");
		}
        return sb.toString();
    }
    
    public String showClients() {
        StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < numOfClients; i++) {
			sb.append((i + 1)).append(")\t").append(clients[i]).append("\n");
		}
        return sb.toString();
    }

}
