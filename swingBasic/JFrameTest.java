package swingBasic;

import javax.swing.*;
import java.awt.*;

public class JFrameTest {
    JFrame frame =  new JFrame("Main Frame");
    JPanel panel =  new JPanel();
    JLabel label = new JLabel("Test Label: ");
    JButton button = new JButton("Test Button");
    JTextArea textArea = new JTextArea("TextArea Test");

    public static void main(String[] args) {
        JFrameTest basic =  new JFrameTest();

        //Button
        basic.button.setForeground(new Color(25, 100, 25));
        basic.button.setFont(new Font("Ink Free", Font.BOLD, 20));
        basic.button.setFocusable(false);

        //TextArea
        basic.textArea.setFont(new Font("Ubuntu", Font.BOLD, 50));

        //Label
        basic.label.setFont(new Font("MV Boli", Font.BOLD, 20));
        basic.label.setHorizontalAlignment(JLabel.CENTER);
        basic.label.setOpaque(true);
        
        //Panel
        basic.panel.add(basic.label);
        basic.panel.add(basic.textArea);
        basic.panel.add(basic.button);

        basic.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        basic.frame.setSize(800, 600);
        basic.frame.getContentPane().setBackground(new Color(100, 100, 100));
        basic.frame.setLayout(new BorderLayout());
        basic.frame.setVisible(true);

        basic.frame.add(basic.panel);
    }
}
