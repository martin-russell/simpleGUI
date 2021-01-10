import java.awt.*; //needed for color
import javax.swing.*; //needed for JFrame elements

public class Main {
    
    public static void main (String[] args) {
        MyFrame frame = new MyFrame("One");

        ImageIcon image = new ImageIcon("duck.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(123,50,70));

        MyFrame secondFrame = new MyFrame("Two");
        ImageIcon sec_image = new ImageIcon("gir.png");
        secondFrame.setIconImage(sec_image.getImage());
        secondFrame.getContentPane().setBackground(new Color(50,123,0));

        frame.setLocation(100,0);
        secondFrame.setLocation(600, 0);

    }
}
