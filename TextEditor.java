package editor;

import javax.swing.*;
import java.awt.*;

public class TextEditor extends JFrame {
    public TextEditor() {
        super("First Stage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

        initComponents();

        setLayout(null); // sets absolute positioning of components


    }

    private void initComponents() {
        JTextArea textArea = new JTextArea();
        textArea.setName("TextArea");
        textArea.setBounds(25, 25, 200, 200);
        add(textArea);

    }

}
