package swingBasic;

import java.awt.*;
import javax.swing.JTextArea;
import javax.swing.JFrame;

public class JTextAreaTest {
    JFrame frame = new JFrame("Nice TextArea Frame bro");
    JTextArea textArea = new JTextArea("Nice TextArea bro");
    public static void main(String[] args) {
        JTextAreaTest test = new JTextAreaTest();
        test.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.frame.setSize(800, 600);
        test.frame.getContentPane().setBackground(new Color(100, 100, 100));
        test.frame.setLayout(new BorderLayout());
        test.frame.setVisible(true);
        
        test.textArea.setFont(new Font("Ubuntu", Font.BOLD, 50));
        test.frame.add(test.textArea);
    }
}
