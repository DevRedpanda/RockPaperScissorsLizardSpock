import java.util.random;

public class mainCode {
    public static void main(String[] args) {
        int score = 0;
        Scanner theScanner = new Scanner(System.in);
        string computerIn;
        string userIn = "";
        int temporaryInput;
        boolean isWinner = false;
        boolean isLoser = false;
        boolean isTie = false;
        String computerArray[] = new String[5];
        computerArray[0] = "rock";
        computerArray[1] = "paper";
        computerArray[2] = "scissors";
        while (theScanner.hasNextLine()) {
            System.out.println("Please make your move.");
            userIn = theScanner.nextLine();
            Random rand = new Random();
            temporaryInput = rand.nextInt(5)+1;
            computerIn = computerArray[temporaryInput];
            if (userIn == computerIn) {
                
                // The game is a tie.
                isTie = true;
            } else if ((userIn == "rock") && (computerIn == "scissors")) {
                // The player wins.
                isWinner = true;
            } else if ((userIn == "paper") && (computerIn == "rock")) {
                // The player wins.
                isWinner = true;
            } else if ((userIn == "scissors") && (computerIn == "paper")) {
                // The player wins.
                isWinner = true;
            } else {
                // The player loses.
                isLoser = true;
            }
            if (isWinner) {
                System.out.println("You won this round!");
            } else if (isLoser) {
                System.out.println("You lost this round.");
            } else if (isTie) {
                System.out.println("This round is a tie.");
            }
            isWinner = false;
            isLoser = false;
            isTie = false;
            System.out.println("Good job!");
            System.out.println("If you want to stop playing, then do not enter ");
            System.out.print("any text.");
        }
    }
}