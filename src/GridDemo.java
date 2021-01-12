import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class GridDemo {

    public static void main (String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("Exploring Grid Layouts");

        //be default, frames us a border layout manager, and so use as much room as possible if you don't assign them to a position (NESWC)
        // Assigning a grid layout to frame

        //by default all of the items appear in 1 row, with a column per item
        // to change this action, add integer flags into the GridLayout parameters
        // rows, then cols (eg 9,1 = 9 rows in 1 column)
        // this is the minimum number of rows / cols - if you add more elements than fit
        // it will expand the number of cols
        // the second two numbers are the padding between elements, h,v in pixels
        frame.setLayout(new GridLayout(3,3,10,10));


        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));



        frame.setVisible(true);


    }
    
}
