package solutions.interfaces.input_output_exe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileUI implements Messageable {
    public Scanner s;
    private final String filePath;

    public FileUI() {
        String packagePath = getClass().getPackage().getName().replace('.', File.separatorChar);
        filePath = System.getProperty("user.dir") + File.separator + "src"
                + File.separator + packagePath + File.separator;
        System.out.println(filePath);
    }

    @Override
    public void showMessage(String message) {
        File f = new File(filePath + "output.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(f);
            pw.println(message);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (pw != null){
                pw.close();
            }
        }
    }

    @Override
    public String getString(String message) {
        File f = new File(filePath + "output.txt");
        String st = null;
        try {
            s = new Scanner(f);
            st = s.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }finally {
            if (s != null){
                s.close();
            }
        }
        return st;
    }
}
