import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class LayeredPaneInTheAss {

    public static void main (String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Layered Panes!");
        frame.setSize(500, 500);

        JLayeredPane lp = new JLayeredPane();
        lp.setSize(300, 300);
        lp.setBackground(Color.CYAN);

        frame.add(lp);

        frame.setVisible(true);

    }
    
}
// comment to allow git push