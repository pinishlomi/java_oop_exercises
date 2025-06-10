package solutions.files.phone_book_exe;

import java.io.Serial;
import java.io.Serializable;

public class Contact implements Serializable{
	
	@Serial
	private static final long serialVersionUID = -3154485433243464542L;
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
