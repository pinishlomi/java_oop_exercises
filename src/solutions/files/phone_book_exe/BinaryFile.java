package solutions.files.phone_book_exe;

import java.io.*;

class BinaryFile {
	private final String filePath;
	private final String filename;
	public BinaryFile(String filename) {
		String packagePath = this.getClass().getPackage()
				.getName().replace('.', File.separatorChar);
		filePath = System.getProperty("user.dir") + File.separator + "src"
				+ File.separator + packagePath + File.separator;
		this.filename = filename;
	}

	public void savePhoneBook(PhoneBook phoneBook) throws IOException {
		ObjectOutputStream file = new ObjectOutputStream(
				new FileOutputStream(filePath + filename));
		file.writeObject(phoneBook);
		file.close();
	}

	public PhoneBook readPhoneBook() throws IOException, ClassNotFoundException {
		ObjectInputStream file = new ObjectInputStream(
				new FileInputStream(filePath + filename));
		PhoneBook phoneBook = (PhoneBook) file.readObject();
		file.close();
		return phoneBook;
	}
}
