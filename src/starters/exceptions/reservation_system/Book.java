package starters.exceptions.reservation_system;

public class Book {
    private final String title;
    private final String author;
    private boolean isReserved;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isReserved = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void reserve() {
        isReserved = true;
    }

    public void unreserve() {
        isReserved = false;
    }
    
	@Override
	public String toString() {
		return title + " by " + author + "(" + isReserved + ")";
	}
}
