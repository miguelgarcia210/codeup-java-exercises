import java.util.Scanner;

public class HighLow {

    /*
    Game picks a random number between 1 and 100.
Prompts user to guess the number.
All user inputs are validated.
If user's guess is less than the number, it outputs "HIGHER".
If user's guess is more than the number, it outputs "LOWER".
If a user guesses the number, the game should declare "GOOD GUESS!"

Keep track of how many guesses a user makes.
Set an upper limit on the number of guesses.
     */
    public static void hiLow() {
        Scanner scanner = new Scanner(System.in);
        int userGuesses = 0;
        int guessLimit;
        int dealerNumber = (int) (Math.random() * (100 - 1 + 1)) + 1;

        System.out.println("Welcome to the club!");
        System.out.println("Let's get started. The game is High-Low");
        System.out.println("Take a guess...");

        int userInput = scanner.nextInt();

        if (userInput <= 0 || userInput > 100) {
            System.out.println("Guess must be between 1 and 100!");
            hiLow();
        }

    }

    public static void main(String[] args) {
        hiLow();
    }
}
