package starters.exceptions.reservation_system;

import starters.exceptions.reservation_system.exceptions.BookNotAvailableException;
import starters.exceptions.reservation_system.exceptions.ClientBookLimitException;
import starters.exceptions.reservation_system.exceptions.ClientBookNotFoundInClientBooksException;
import starters.exceptions.reservation_system.exceptions.ClientMaxBooksException;

public class Client {
    private final String name;
    private final int maxBooks;
    private final Book[] reservedBooks;
    private int numOfBooks;

    public Client(String name, int maxBooks) {
        this.name = name;
        this.maxBooks = maxBooks;
        this.reservedBooks = new Book[maxBooks];
    }

    public String getName() {
        return name;
    }

    public int getMaxBooks() {
        return maxBooks;
    }

    public Book[] getReservedBooks() {
        // TODO implement your code
        return null;
    }


    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void reserveBook(Book book) {
        // TODO implement your code

    }

    public void returnBook(Book book)  {
        // TODO implement your code

    }

    private boolean isExist(Book book) {
        // TODO implement your code
        return false;

    }

    private void remove(Book book) {
        // TODO implement your code
    }

    @Override
    public String toString() {
        return name + ", " + numOfBooks + "(" + maxBooks + ")";
    }
}
