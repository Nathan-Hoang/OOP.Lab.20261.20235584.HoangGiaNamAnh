import javax.swing.JOptionPane;

public class Lab01_Ex6_1 {
    public static void main(String[] args){

        Object[] customOption = {"Yes", "No", };
        
        int choice = JOptionPane.showOptionDialog(null, "Do you want to change to first class ticket?", "Select an Option", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, customOption, customOption[0]);
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen Yes.");
        } 
        else {JOptionPane.showMessageDialog(null, "You've chosen No.");
        }
        
        System.exit(0);
    }
}
