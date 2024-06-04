package swingBasic;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nice BorderLayout Bro");
        JPanel panel = new JPanel();
        JButton[] buttons = new JButton[9];
        int count = 0;

        panel.setLayout(new BorderLayout(10, 15));

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setText("Nice Button " + (count++ + 1));
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 40));
            buttons[i].setFocusable(false);
        }
        
        panel.add(buttons[0], BorderLayout.WEST);
        panel.add(buttons[1], BorderLayout.EAST);
        panel.add(buttons[2], BorderLayout.NORTH);
        panel.add(buttons[3], BorderLayout.SOUTH);
        panel.add(buttons[4], BorderLayout.CENTER);
        // panel.add(buttons[5], BorderLayout.EAST);
        // panel.add(buttons[6], BorderLayout.WEST);
        // panel.add(buttons[7], BorderLayout.NORTH);
        // panel.add(buttons[8], BorderLayout.SOUTH);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(new Color(100, 100, 100));
        frame.setVisible(true);
    }
}
