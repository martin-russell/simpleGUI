import javax.swing.*;
import javax.swing.event.AncestorListener;

public class LaunchPage implements ActionListener {
    
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");
    
    LaunchPage(){

        myButton.setBounds(100,160,200,400);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("window 1");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
