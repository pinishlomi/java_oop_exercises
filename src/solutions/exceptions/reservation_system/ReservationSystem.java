package solutions.exceptions.reservation_system;
import solutions.exceptions.reservation_system.exceptions.*;

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
        if (numOfBooks < MAX_BOOKS) {
        	books[numOfBooks++] = book;
        }
    }

    public void addClient(Client client) {
        if (numOfClients < MAX_CLIENTS) {
        	clients[numOfClients++] = client;
        }
    }

    public Book[] getAvailableBooks() {
    	int counter = 0;
        for (int i = 0; i < numOfBooks; i++) {
			if (!books[i].isReserved()) {
				counter++;
			}
		}
    	Book[] availableBooks = new Book[counter];
        for (int i = 0, j = 0; i < numOfBooks; i++) {
			if (!books[i].isReserved()) {
				availableBooks[j++] = books[i];
			}
		}
        return availableBooks;
    }

    public Book[] getReservedBooks() {
    	int counter = 0;
        for (int i = 0; i < numOfBooks; i++) {
			if (books[i].isReserved()) {
				counter++;
			}
		}
    	Book[] reservedBooks = new Book[counter];
        for (int i = 0, j = 0; i < numOfBooks; i++) {
			if (books[i].isReserved()) {
				reservedBooks[j++] = books[i];
			}
		}
        return reservedBooks;
    }

    public void reserveBook(String clientName, String bookTitle) {
        try {
            Client Client = findClient(clientName);
            Book book = findBook(bookTitle);
            Client.reserveBook(book);
        } catch (GeneralException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void returnBook(String clientName, String bookTitle) {
        try {
            Client Client = findClient(clientName);
            Book book = findBook(bookTitle);
            Client.returnBook(book);
        } catch (GeneralException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private Client findClient(String name) throws ClientNotFoundException {
    	for (int i = 0; i < numOfClients; i++) {
            if (clients[i].getName().equals(name)) {
                return clients[i];
            }
        }
        throw new ClientNotFoundException(name);
    }

    private Book findBook(String name) throws BookNotFoundException {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getTitle().equals(name)) {
                return books[i];
            }
        }
        throw new BookNotFoundException(name);
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
