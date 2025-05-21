package solutions.interfaces.input_output_exe;

import javax.swing.*;

public class GraphicUI implements Messageable {
    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public String getString(String message) {
        return JOptionPane.showInputDialog(message);
    }
}
