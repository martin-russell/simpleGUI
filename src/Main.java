import java.awt.*; //needed for color
import javax.swing.*; //needed for JFrame elements

public class Main {
    
    public static void main (String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Martin's Awesome Window!");
        frame.setSize(400,400);
        frame.setLocation(400,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("duck.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(150,150,0));

        
    }
}
