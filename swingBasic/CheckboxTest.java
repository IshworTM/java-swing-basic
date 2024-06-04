package swingBasic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxTest implements ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox checkBox = (JCheckBox) e.getSource();
        if (checkBox.isSelected()) {
            checkBox.setText("Selected :)");
        }
        else{
            checkBox.setText("Not Selected :(");
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nice ButtonClickEvent Bro");
        JPanel panel = new JPanel();
        JCheckBox checkBox = new JCheckBox("Not Selected :(", false);

        checkBox.setFont(new Font("MV Boli", Font.BOLD, 30));
        checkBox.addItemListener(new CheckboxTest());
        panel.add(checkBox);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(new Color(100, 100, 100));
        frame.setVisible(true);
    }
}
