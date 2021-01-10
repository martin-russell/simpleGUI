import java.awt.*;
import javax.swing.*; //needed for JFrame elements

public class LabelTesting {
    
    public static void main (String[] args) {

        ImageIcon image = new ImageIcon("gir.png"); // creates new image
        JLabel label = new JLabel(); // creates a new JLable
        label.setText("This is my label"); // assign text to label
        label.setIcon(image); // assign image to label
        label.setHorizontalTextPosition(JLabel.CENTER); // put text in middle relative to image
        label.setVerticalTextPosition(JLabel.TOP); // put text above the image
        label.setForeground(new Color(0x4400FF)); // set colour of text
        label.setFont(new Font("Arial", Font.BOLD, 20)); // set font of text

        

        JFrame frame = new JFrame(); // create new frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set close behaviour
        frame.setSize(900,900); // set frame size
        frame.setVisible(true); // make frame visible
        frame.add(label); // add the label to the frame


    }
}