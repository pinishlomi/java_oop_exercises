package solutions.files.csv_file_exe;

import java.io.*;

class CSVFile {
	private final String filePath;
	private final String filename;

	public CSVFile(String filename) {
		String packagePath = this.getClass().getPackage().getName().replace('.', File.separatorChar);
		filePath = System.getProperty("user.dir") + File.separator + "src"
				+ File.separator + packagePath + File.separator;
		this.filename = filename;
	}

	public String readFileContent() throws IOException {
		BufferedReader  reader = new BufferedReader(new FileReader(filePath+filename));
		StringBuilder sb = new StringBuilder();
        String line = reader.readLine();
        String[] header = line.split(",");
		line = reader.readLine();
        while (line != null) {
            String[] fields = line.split(",");
            for (int i = 0; i < header.length; i++) {
            	sb.append(header[i]).append(": ").append(fields[i]).append(", ");
			}
			sb.append("\n");
  			line = reader.readLine();
        }
		reader.close();
		return sb.toString();
	}

	public void writeFileContent(String content) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath + filename, true));
		writer.write(content);
		writer.close();
	}

}

public class CSVFileReadWrite{
	public static void main(String[] args) throws IOException {
		String filename = "persons.csv";
		CSVFile csvFile = new CSVFile(filename);
		String content = csvFile.readFileContent();
		System.out.println("File content before adding:\n" + content);
		csvFile.writeFileContent("\nYael Mor,30,F");
		System.out.println("File content after adding:");
		System.out.println(csvFile.readFileContent());
	}

}
