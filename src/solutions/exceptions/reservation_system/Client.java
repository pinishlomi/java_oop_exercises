package solutions.exceptions.reservation_system;

import solutions.exceptions.reservation_system.exceptions.*;

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
        Book[] tempReservedBooks = new Book[numOfBooks];
        System.arraycopy(reservedBooks, 0, tempReservedBooks, 0, numOfBooks);
        return tempReservedBooks;
    }


    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void reserveBook(Book book) throws ClientMaxBooksException, ClientBookLimitException, BookNotAvailableException {
        if (numOfBooks >= maxBooks) {
            throw new ClientMaxBooksException(name, numOfBooks, maxBooks);
        }
        if (isExist(book)) {
            throw new ClientBookLimitException(name, book.getTitle());
        }
        if (book.isReserved()) {
            throw new BookNotAvailableException(book.getTitle());
        }
        book.reserve();
        reservedBooks[numOfBooks++] = book;
        System.out.println(name + " has reserved " + book.getTitle() + " by " + book.getAuthor());
    }

    public void returnBook(Book book) throws ClientBookNotFoundInClientBooksException {
        if (!isExist(book)) {
            throw new ClientBookNotFoundInClientBooksException(name, book.getTitle());
        }
        book.unreserve();
        remove(book);
        System.out.println(name + " has returned " + book.getTitle() + " by " + book.getAuthor());
    }

    private boolean isExist(Book book) {
        for (int i = 0; i < numOfBooks; i++) {
            if (reservedBooks[i].equals(book)) {
                return true;
            }
        }
        return false;
    }

    private void remove(Book book) {
        for (int i = 0; i < numOfBooks; i++) {
            if (reservedBooks[i].equals(book)) {
                if (numOfBooks - 1 - i >= 0)
                    System.arraycopy(reservedBooks, i + 1, reservedBooks, i, numOfBooks - 1 - i);
                numOfBooks--;
            }
        }
    }

    @Override
    public String toString() {
        return name + ", " + numOfBooks + "(" + maxBooks + ")";
    }


}
