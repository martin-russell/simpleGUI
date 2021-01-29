import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class LayeredPaneInTheAss {

    public static void main (String[] args) {

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.CYAN);
        label2.setBounds(75,75,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.GREEN);
        label3.setBounds(100,100,200,200);

        JLayeredPane lp = new JLayeredPane();
        lp.setBounds(0,0,500,500);
        lp.add(label1, JLayeredPane.DEFAULT_LAYER);
        lp.add(label2, JLayeredPane.DEFAULT_LAYER);
        lp.add(label3, JLayeredPane.DRAG_LAYER);

        // Can also set the layer depth for the panes with INTEGER.ValueOf()
        // where 0 is the bottom, and upto 5 on top. 

        // lp.add(label1, INTEGER.ValueOf(3);)

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Layered Panes!");
        frame.setSize(500, 500);
        frame.setLayout(null);

        frame.add(lp);
        frame.setVisible(true);

    }
    
}
