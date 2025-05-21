package solutions.interfaces.input_output_exe;

import java.util.Scanner;

public class ConsoleUI implements Messageable {
    public static Scanner s = new Scanner(System.in);
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String getString(String message) {
        System.out.println(message);
        return s.nextLine();
    }
}
