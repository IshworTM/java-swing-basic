package swingBasic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonClickTest implements ActionListener {
    private int count = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        button.setText("Click count: " + count++);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nice ButtonClickEvent Bro");
        JPanel panel = new JPanel();
        JButton button = new JButton("Nice Button");

        button.setFont(new Font("MV Boli", Font.BOLD, 40));
        button.setFocusable(false);
        button.addActionListener(new ButtonClickTest());
        panel.add(button);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(new Color(100, 100, 100));
        frame.setVisible(true);
    }
}
