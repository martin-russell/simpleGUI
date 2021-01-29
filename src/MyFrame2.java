import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MyFrame2 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    JButton button;
    JTextField textField;
    JCheckBox checkBox;

    //create some image icons to change the check buttons
    ImageIcon xicon;
    ImageIcon oicon;

    MyFrame2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        xicon = new ImageIcon("simpleGUI/vlilduck.png");
        oicon = new ImageIcon("simpleGUI/vlilgir.png");


        button = new JButton("Submit");
        button.addActionListener(this); //DONT FORGET TO ADD TEH EVENT LISTENERS DUMB ASS!!!

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Arial", Font.ITALIC, 25));
        textField.setForeground(Color.MAGENTA);
        textField.setBackground(Color.DARK_GRAY);
        textField.setCaretColor(Color.WHITE);
        //textField.setText("default text to display"); // this does not disappear when you click into it. It needs editing

        checkBox = new JCheckBox();
        checkBox.setText("Select the robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("System", Font.PLAIN, 25));
        checkBox.setIcon(xicon);
        checkBox.setSelectedIcon(oicon);



        this.add(button);
        this.add(textField);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(textField.getText());
            //button.setEnabled(false);// this prevents the button being clicked more than once
            //textField.setEditable(false); // this prevents the text field being edited once the button has been clicked once. 
            if (checkBox.isSelected() == true) {
                System.out.println(textField.getText() + "  is not a robot");
            } else {
                System.out.println(textField.getText() + " is a robot");
            }


        }



    }

    
} 


