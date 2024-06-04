package swingBasic;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

public class JButtonTest {
    JFrame frame = new JFrame("Nice Button Frame Bro");
    JButton button = new JButton("Nice Button");
    public static void main(String[] args) {
        JButtonTest nice = new JButtonTest();

        nice.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nice.frame.setSize(800, 600);
        nice.frame.getContentPane().setBackground(new Color(100, 100, 100));
        nice.frame.setLayout(new BorderLayout());
        nice.frame.setVisible(true);

        nice.button.setFont(new Font("Ink Free", Font.BOLD, 69));
        nice.button.setFocusable(false);

        nice.frame.add(nice.button);
    }
}
