// import da tingz
import javax.swing.JOptionPane;

public class trueOrFalse {
    public void trueFalseGame(){
        while (JOptionPane.showConfirmDialog(null, "Is King Powell our lord and savior?", "I AM THE TITLE!", JOptionPane.YES_NO_OPTION) !=0) {
            //display message when answer is wrong
            JOptionPane.showMessageDialog(null, "WRONG ANSWER! REPENT YOU FILTHY SCUM!");
        }
        JOptionPane.showConfirmDialog(null, "YES BROTHER! MAY KING POWELL BLESS YOUR SOUL.");
        
    }
}