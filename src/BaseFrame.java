import javax.swing.*;

public class BaseFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    BaseFrame() {
        this.setTitle("Default Window Title from class");  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 500); 
        this.setVisible(true);
    }
    
}
