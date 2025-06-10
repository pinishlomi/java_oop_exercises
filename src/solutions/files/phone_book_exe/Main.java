package solutions.files.phone_book_exe;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PhoneBook phoneBook = new PhoneBook("Moshe", 10);
		phoneBook.add(new Contact("054-4652124", "Taly", GROUP.Family));
		phoneBook.add(new Contact("050-1234124", "Mor", GROUP.Friends));
		phoneBook.add(new Contact("054-8594521", "Kobi", GROUP.Work));
		String filename = "phoneBook.dat";
		BinaryFile binaryFile = new BinaryFile(filename);
		binaryFile.savePhoneBook(phoneBook);
		phoneBook = binaryFile.readPhoneBook();
		System.out.println(phoneBook);
	}
}
/*
PhoneBook list:
Contact [phoneNumber=054-4652124, name=Taly, group=Family]
Contact [phoneNumber=050-1234124, name=Mor, group=Friends]
Contact [phoneNumber=054-8594521, name=Kobi, group=Work]
 */
