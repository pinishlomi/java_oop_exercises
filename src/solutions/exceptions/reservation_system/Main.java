package solutions.exceptions.reservation_system;

import java.util.Random;
import java.util.Scanner;

public class Main {
	private static Scanner s;
	private static final String[] MENU = {
			"Reserve a book",
			"Return a book",
			"Display a list of available books",
			"Display a list of reserved books",
			"Exit"
	};

	public static void main(String[] args) {
		ReservationSystem reservationSystem = new ReservationSystem();
		init(reservationSystem);
		run(reservationSystem);

	}

	private static void run(ReservationSystem rs){
		s = new Scanner(System.in);
		int userChosen;
		boolean exit = false;
		do {
			userChosen = showMenu(s);
			switch (userChosen) {
				case 1 -> reserveBook(rs);
				case 2 -> returnBook(rs);
				case 3 -> showAvailableBooks(rs);
				case 4 -> showReservedBooks(rs);
				case 5 -> exit = true;
				default -> System.out.println("Unexpected value");
			}

		}while (!exit);
		System.out.println("Done... Bye");
		s.close();
	}

	private static void reserveBook(ReservationSystem rs) {
		s.nextLine();
		System.out.println(rs.showClients());
		System.out.println("Choose client name: ");
		String clientName = s.nextLine();
		showAvailableBooks(rs);
		System.out.println("Choose book title to reserve: ");
		String bookTitle = s.nextLine();
		rs.reserveBook(clientName, bookTitle);
	}

	private static void returnBook(ReservationSystem rs) {
		s.nextLine();
		System.out.println(rs.showClients());
		System.out.println("Choose client name: ");
		String clientName = s.nextLine();
		showAvailableBooks(rs);
		System.out.println("Choose book title to reserve: ");
		String bookTitle = s.nextLine();
		rs.returnBook(clientName, bookTitle);
	}

	private static void showReservedBooks(ReservationSystem rs) {
		Book[] reservedBooks = rs.getReservedBooks();
		System.out.println("Reserved books: ");
		for (int i = 0; i < reservedBooks.length; i++) {
			System.out.println((i+1) + ")\t" + reservedBooks[i]);
		}
	}

	private static void showAvailableBooks(ReservationSystem rs) {
		Book[] availableBooks = rs.getAvailableBooks();
		System.out.println("Available books: ");
		for (int i = 0; i < availableBooks.length; i++) {
			System.out.println((i+1) + ")\t" + availableBooks[i]);
		}
	}

	private static int showMenu(Scanner s) {
		System.out.println("\n======= Menu =======");
		for (int i = 0; i < MENU.length; i++) {
			System.out.println((i + 1) + ". " + MENU[i]);
		}
		System.out.println("Please enter your chose : ");
		return s.nextInt();
	}

	private static void init(ReservationSystem rs) {
		Random r = new Random();
		System.out.println("Adding 5 clients");
		rs.addClient(new Client("David Alon", 2));
		rs.addClient(new Client("Hadar Levin", r.nextInt(3) + 1));
		rs.addClient(new Client("Maayan Yaniv", r.nextInt(3) + 1));
		rs.addClient(new Client("Avi Shoham", r.nextInt(3) + 1));
		rs.addClient(new Client("Dina Peretz", r.nextInt(3) + 1));
		System.out.println(rs.showClients());

		System.out.println("\nAdding 20 books");
		rs.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
		rs.addBook(new Book("1984", "George Orwell"));
		rs.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
		rs.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
		rs.addBook(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez"));
		rs.addBook(new Book("Brave New World", "Aldous Huxley"));
		rs.addBook(new Book("The Grapes of Wrath", "John Steinbeck"));
		rs.addBook(new Book("Beloved", "Toni Morrison"));
		rs.addBook(new Book("The Color Purple", "Alice Walker"));
		rs.addBook(new Book("Heart of Darkness", "Joseph Conrad"));
		rs.addBook(new Book("Frankenstein", "Mary Shelley"));
		rs.addBook(new Book("Pride and Prejudice", "Jane Austen"));
		rs.addBook(new Book("Wuthering Heights", "Emily Bronte"));
		rs.addBook(new Book("Jane Eyre", "Charlotte Bronte"));
		rs.addBook(new Book("The Picture of Dorian Gray", "Oscar Wilde"));
		rs.addBook(new Book("The Adventures of Huckleberry Finn", "Mark Twain"));
		rs.addBook(new Book("The Scarlet Letter", "Nathaniel Hawthorne"));
		rs.addBook(new Book("The Sun Also Rises", "Ernest Hemingway"));
		rs.addBook(new Book("The Sound and the Fury", "William Faulkner"));
		rs.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
		System.out.println(rs.showBooks());

		System.out.println("\ntry to reserve 'The Lord of the Rings' to David Alon");
		rs.reserveBook("David Alon", "The Lord of the Rings");

		System.out.println("\ntry to reserve 'The Lord of the Rings' to David Alon");
		rs.reserveBook("David Alon", "The Lord of the Rings");

		System.out.println("\ntry to reserve 'The Sun Also Rises' to David Alon");
		rs.reserveBook("David Alon", "The Sun Also Rises");

		System.out.println("\ntry to reserve 'Pride and Prejudice' to David Alon");
		rs.reserveBook("David Alon", "Pride and Prejudice");

		System.out.println("\ntry to reserve 'The Lord of the Rings' to Hadar Levin");
		rs.reserveBook("Hadar Levin", "The Lord of the Rings");

		System.out.println("\ntry to reserve 'no book' to Hadar Levin");
		rs.reserveBook("Hadar Levin", "no book");

		System.out.println("\ntry to reserve 'The Lord of the Rings' to no client");
		rs.reserveBook("no client", "The Lord of the Rings");

		System.out.println("\ntry to return 'The Sun Also Rises' to Hadar Levin");
		rs.returnBook("Hadar Levin", "The Sun Also Rises");
	}
}