package swingBasic;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nice FlowLayout Bro");
        JPanel panel = new JPanel();
        JButton[] buttons = new JButton[9];
        int count = 0;

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setText("Nice Button " + (count++ + 1));
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 40));
            buttons[i].setFocusable(false);
            panel.add(buttons[i]);
        }
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 15));
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(new Color(100, 100, 100));
        frame.setVisible(true);
    }
}
