/*
 * Created by bhalpin on 5/18/17.
 * Changed by bstaffo on 5/23/17.
 *   Changed:
 *      Added space after slashes (//) to make comments easier to read.
 *      Added several print functions instead of one with concatinated string.
 *      Made comments more descriptive.
 *      Added comments explaining more about the code.
 *      Indented code after first class.
 */

// Import all frameworks
import java.util.Scanner;
import java.util.Random;

public class Main { // Public class
    public static void main(String[] args) { // Main class

        // Declare variables
        String personPlay; // User's play -- "R", "P", or "S"
        String ScomputerPlay = ""; // Computer's play -- "R", "P", or "S".
        String response;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        // Give user instructions
        System.out.println("Hey, let's play Rock, Paper, Scissors!");
        System.out.println("Please make a move.");
        System.out.println("Rock make a move.");
        System.out.println("Please enter a move.");
        System.out.println("Rock = R");
        System.out.println("Paper = P");
        System.out.println("Scissors = S");

        System.out.println(""); // Make a new line

        // Generate computer's play (0,1,2)
        int IcomputerPlay = generator.nextInt(5)+1;

        // Translate computer's randomly generated play to
        // string using if statements

        if (IcomputerPlay == 1)
           ScomputerPlay = "R";
        else if (IcomputerPlay == 2)
           ScomputerPlay = "P";
        else if (IcomputerPlay == 3)
           ScomputerPlay = "S";
        else if (IcomputerPlay == 4)
           ScomputerPlay = "L";
        else if (IcomputerPlay == 5)
           ScomputerPlay = "SP";

        // Get player's play from input-- note that this is
        // stored as a string
        System.out.println("Enter your play: ");
        personPlay = scan.next();

        // Make player's play uppercase for ease of comparison
        personPlay = personPlay.toUpperCase();

        // Print computer's play
        System.out.println("Computer play is: " + IcomputerPlay);


        //Check to see who won. Use nested if statements.

        // Ben's suggestion: Use switch statement instead of nested if statements to make code more compact.

        if (personPlay.equals(IcomputerPlay))
           System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
           if (ScomputerPlay.equals("S"))
              System.out.println("Rock crushes scissors. You win!!");
        else if (ScomputerPlay.equals("P"))
                System.out.println("Paper eats rock. You lose!!");
        else if (personPlay.equals("P"))
           if (ScomputerPlay.equals("S"))
           System.out.println("Scissor cuts paper. You lose!!");
        else if (ScomputerPlay.equals("R"))
                System.out.println("Paper eats rock. You win!!");
        else if (personPlay.equals("S"))
             if (ScomputerPlay.equals("P"))
             System.out.println("Scissor cuts paper. You win!!");
        else if (ScomputerPlay.equals("R"))
                System.out.println("Rock breaks scissors. You lose!!");
        else
             System.out.println("Invalid user input.");
    }
}
