//import library
import javax.swing.JOptionPane;
import java.util.Random;

//our class name
public class GuessNumber {
    //call rand class
    Random rand = new Random();

    //method for guessing numbers
    public void guess(){
        //declare variables
        String message = "Guess a number between 0 - 100:";
        int userGuess = Integer.parseInt(JOptionPane.showInputDialog(message));
        //make rand number
        int randNumber = rand.nextInt(1, 101);

        while(userGuess != randNumber){
            if(userGuess > randNumber){
                message = "Nah jit. too high (like travy) you gotta guess lower";
            } 
            else if (userGuess < randNumber){
                message = "Nah unc. too low (like my cadillac) you gotta guess higher";
            }
            //read user next guess
            userGuess = Integer.parseInt(JOptionPane.showInputDialog(message));
        }
        message = "YO YOU GOT IT RIGHT!!! the number was " + randNumber;
        JOptionPane.showMessageDialog(null, message);
    }
}
