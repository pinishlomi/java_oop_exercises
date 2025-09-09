package starters.files.phone_book_exe;

public class PhoneBook{

	private final String name;
	private final Contact[] contacts;
	private int numOfContacts;
	
	public PhoneBook(String name, int maxContacts) {
		super();
		this.name = name;
		this.contacts = new Contact[maxContacts];
	}

	public String getName() {
		return name;
	}

	public void add(Contact contact) {
		if (numOfContacts < contacts.length) {
			contacts[numOfContacts++] = contact;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("PhoneBook list:\n");
		for (int i = 0; i < numOfContacts; i++) {
			sb.append(contacts[i]).append("\n");
		}
		return sb.toString();
	}
}
