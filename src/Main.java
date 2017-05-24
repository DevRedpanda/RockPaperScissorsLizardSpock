/**
 * Created by bhalpin on 5/18/17.
 */
import java.util.Scanner;
import java.util.Random;
public class Main {




public static void main(String[] args) {
    String personPlay; //User's play -- "R", "P", "S", "L", or "SP"
    String computerPlay = ""; //Computer's play -- "R", "P", "L", or "SP"
    int computerInt; //Randomly generated number used to determine 
                     //computer's play 
    String response; 


    Scanner scan = new Scanner(System.in); 
    Random generator = new Random(); 

    System.out.println("Hey, let's play Rock, Paper, Scissors, Lizard, Spock!\n" +
                       "Please enter a move.\n" + "Rock = R, Paper" + 
                       "= P, and Scissors = S." + "Lizard = L" + "Spock = SP");

    System.out.println();

    //Generate computer's play (0,1,2) 
    computerInt = generator.nextInt(5)+1;

    //Translate computer's randomly generated play to 
    //string using if //statements 

    if (computerInt == 1) 
       computerPlay = "R"; 
    else if (computerInt == 2) 
       computerPlay = "P"; 
    else if (computerInt == 3) 
       computerPlay = "S"; 
    else if (computerInt == 4)
       computerPlay = "L";
    else if (computerInt == 5)
       computerPlay = "SP";

    //Get player's play from input-- note that this is 
    // stored as a string 
    System.out.println("Enter your play: "); 
    personPlay = scan.next();

    //Make player's play uppercase for ease of comparison 
    personPlay = personPlay.toUpperCase(); 

    //Print computer's play 
    System.out.println("Computer play is: " + computerPlay); 


    //See who won. Use nested ifs 

    if (personPlay.equals(computerPlay)) 
       System.out.println("It's a tie!"); 
    else if (personPlay.equals("R")) 
       if (computerPlay.equals("S")) 
          System.out.println("Rock crushes scissors. You win!!");
    else if (computerPlay.equals("P")) 
            System.out.println("Paper eats rock. You lose!!"); 
    else if (personPlay.equals("P")) 
       if (computerPlay.equals("S")) 
       System.out.println("Scissor cuts paper. You lose!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("Paper eats rock. You win!!"); 
    else if (personPlay.equals("S")) 
         if (computerPlay.equals("P")) 
         System.out.println("Scissor cuts paper. You win!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("Rock breaks scissors. You lose!!"); 
    else 
         System.out.println("Invalid user input."); 
}
}
