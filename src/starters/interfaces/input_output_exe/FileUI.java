package starters.interfaces.input_output_exe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileUI{
    public Scanner s;
    private final String filePath;

    public FileUI() {
        String packagePath = getClass().getPackage().getName().replace('.', File.separatorChar);
        filePath = System.getProperty("user.dir") + File.separator + "src"
                + File.separator + packagePath + File.separator;
        System.out.println(filePath);
    }
    // TODO implement your code
}
