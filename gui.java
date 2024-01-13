package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gui {
    public static void main(String[] args) {
        
        ImageIcon setup = new ImageIcon("other.png");

        JLabel label = new JLabel();
        label.setText("Welcome to the Carnival!");
        label.setIcon(setup);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.yellow);
        label.setFont(new Font("Serif",Font.PLAIN,30));
        label.setIconTextGap(-25);


        
        JFrame frame = new JFrame();
        frame.setTitle("Carnival");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setVisible(true);
        
        ImageIcon image = new ImageIcon("tent.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.red);
        frame.add(label);

    }
}
