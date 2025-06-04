package starters.files.phone_book_exe;

public class Contact{
	
	private final String phoneNumber;
	private final String name;
	private final GROUP group;
	
	public Contact(String phoneNumber, String name, GROUP group) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.group = group;
	}

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + ", group=" + group + "]";
	}	
}
