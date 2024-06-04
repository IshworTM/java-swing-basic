package swingBasic;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class JLabelTest {
    JFrame frame = new JFrame("Nice Label Frame Bro");
    JLabel label = new JLabel("What is this label");
    public static void main(String[] args) {
        JLabelTest test = new JLabelTest();
        
        test.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.frame.setSize(800, 600);
        test.frame.getContentPane().setBackground(new Color(100, 100, 100));
        test.frame.setLayout(new BorderLayout());
        test.frame.setVisible(true);

        test.label.setForeground(new Color(25, 100, 25));
        test.label.setBackground(new Color(100, 25, 25));
        test.label.setFont(new Font("MV Boli", Font.BOLD, 69));
        test.label.setHorizontalAlignment(JLabel.CENTER);
        test.label.setOpaque(true);

        test.frame.add(test.label);
    }
}
