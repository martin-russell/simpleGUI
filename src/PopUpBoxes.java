import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PopUpBoxes {

    public static void main (String [] args) {

        //JOptionPane.showMessageDialog(null, "This is a plain message", "Argh!", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is an information message", "Argh!", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is a questions message", "Argh!", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is a warning", "Argh!", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is an error message", "Argh!", JOptionPane.ERROR_MESSAGE);
    
        //System.out.println(JOptionPane.showConfirmDialog(null, "Would you like free money?", "Annoying Popup", JOptionPane.YES_NO_CANCEL_OPTION));
        /* the return values form these buttons is
        /  Yes = 0
        /  No = 1
        /  Cancel = 2
        /  kill window = -1
        */


/*         // the out put of a dialoge box can be used to return int values
        if (JOptionPane.showConfirmDialog(null, "Are you a winner?", "Test", JOptionPane.YES_NO_OPTION) == 0) {
            System.out.println("You clicked yes");
        } else {
            System.out.println("You did not click yes");
        } */

/*        // SHOW INOUT DIALOGUE
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, " + name);
*/

        String[] responses = {"Beta","Alpha","Delta"};
        ImageIcon image = new ImageIcon("simpleGUI/lilduck.png");
        JOptionPane.showOptionDialog(
            null, 
            "You are awesome!", 
            "Secret Message", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.ERROR_MESSAGE, 
            image, 
            responses, 
            0);

    }
    
}
