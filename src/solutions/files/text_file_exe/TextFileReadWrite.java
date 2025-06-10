package solutions.files.text_file_exe;

import java.io.*;
import java.util.Scanner;

class TextFile {
	private final String filePath;
	private final String filename;
	public TextFile(String filename) {
		String packagePath = this.getClass().getPackage().getName().replace('.', File.separatorChar);
		filePath = System.getProperty("user.dir") + File.separator + "src"
				+ File.separator + packagePath + File.separator;
		this.filename = filename;
	}

	public String readFileContent() throws FileNotFoundException {
		File f = new File(filePath + filename);
		Scanner s = new Scanner(f);
		StringBuilder sb = new StringBuilder();
		while (s.hasNext()) {
			sb.append(s.nextLine()).append("\n");
		}
		s.close();
		return sb.toString();
	}

	public void writeFileContent(String content) throws IOException {
		writeFileContent(content, false);
	}
	public void writeFileContent(String content, boolean append) throws IOException {
		FileWriter f = new FileWriter(filePath + filename, append);
		PrintWriter pw = new PrintWriter(f);
		pw.print(content);
		pw.close();
	}

}

public class TextFileReadWrite{
	public static void main(String[] args) throws IOException {
		TextFile textFile = new TextFile("text.txt");
		textFile.writeFileContent("Start file content...");
		String content = textFile.readFileContent();
		System.out.println("File content before adding:\n" + content);
		content = "\nsome content";
		textFile.writeFileContent(content, true);
		System.out.println("File content after adding:");
		System.out.println(textFile.readFileContent());
	}

}
