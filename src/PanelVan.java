import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelVan {

    public static void main (String[] args) {

        //Implementing Border Layout 
        // NORTH / SOUTH / EAST / WEST / CENTER
        // BorderLayout is default for panels. 




        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10,10));
        frame.setTitle("Simple GUI Layout using Borders");
        

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.cyan);
        panel5.setBackground(Color.orange);
        // panels can also act as containers, just like the JFrame componant
        // By default panels have a FLOW default layout manager
        panel5.setLayout(new BorderLayout());

        JPanel panel11 = new JPanel();
        JPanel panel12 = new JPanel();
        JPanel panel13 = new JPanel();
        JPanel panel14 = new JPanel();
        JPanel panel15 = new JPanel();

        panel11.setBackground(Color.red);
        panel12.setBackground(Color.green);
        panel13.setBackground(Color.blue);
        panel14.setBackground(Color.cyan);
        panel15.setBackground(Color.orange);
        // panels can also act as containers, just like the JFrame componant
        // By default panels have a FLOW default layout manager
        panel15.setLayout(new FlowLayout());

        panel11.setPreferredSize(new Dimension(50,50));
        panel12.setPreferredSize(new Dimension(50,50));
        panel13.setPreferredSize(new Dimension(50,50));
        panel14.setPreferredSize(new Dimension(50,50));
        panel15.setPreferredSize(new Dimension(100,100));

        panel5.add(panel11, BorderLayout.SOUTH);
        panel5.add(panel12, BorderLayout.EAST);
        panel5.add(panel13, BorderLayout.WEST);
        panel5.add(panel14, BorderLayout.CENTER);
        panel5.add(panel15, BorderLayout.NORTH);




        panel1.setPreferredSize(new Dimension(50,50));
        panel2.setPreferredSize(new Dimension(50,50));
        panel3.setPreferredSize(new Dimension(50,50));
        panel4.setPreferredSize(new Dimension(50,50));
        panel5.setPreferredSize(new Dimension(50,50));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);
        

        panel15.add(new JButton("1"));
        panel15.add(new JButton("2"));
        panel15.add(new JButton("3"));
        panel15.add(new JButton("4"));
        panel15.add(new JButton("5"));
        panel15.add(new JButton("6"));
        panel15.add(new JButton("7"));
        panel15.add(new JButton("8"));
        panel15.add(new JButton("9"));





        

        // Sometimes, items do not show up, as the visibility is set before adding the items. 
        // to resolved this, put the .setVisible at the end
        frame.setVisible(true);

    }
    
}
