import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

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

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
