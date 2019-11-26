import java.util.Scanner;

public class HighLow {

/*
    TODO:
     Set an upper limit on the number of guesses.
*/

    public static void hiLow() {
        Scanner scanner = new Scanner(System.in);
        int userGuesses = 0;
        int guessLimit = 20;
        int dealerNumber = (int) (Math.random() * (100 - 1 + 1)) + 1;

        System.out.println("~~~ High Low ~~~");
        System.out.println("Dealer: Take a guess...");
        int userInput = scanner.nextInt();

        boolean exit = false;
        while (!exit) {
            if (userInput <= 0 || userInput > 100) {
                System.out.println("Guess must be between 1 and 100!");
                userGuesses++;
            } else if (userInput < dealerNumber) {
                System.out.println("HIGHER");
                userGuesses++;
                userInput = scanner.nextInt();
            } else if (userInput > dealerNumber) {
                System.out.println("LOWER");
                userGuesses++;
                userInput = scanner.nextInt();
            } else if (userInput == dealerNumber) {
                userGuesses++;
                System.out.println("GOOD GUESS");
                System.out.printf("Game Stats:%nGuesses: %s%n", userGuesses);

                System.out.println("Would you like to play again? (y/n)");
                String userResponse = scanner.next();
//                userResponse = scanner.nextLine();

                boolean playAgain = false;
                while (!playAgain) {
                    switch (userResponse.toLowerCase()) {
                        case "y":
                        case "yes":
                            exit = true;
                            playAgain = true;
                            hiLow();
                            break;
                        case "n":
                        case "no":
                            exit = true;
                            playAgain = true;
                            System.out.println("Good game! Bye for now.");
                            break;
                        default:
                            System.out.println("Sorry, did not catch that. Continue? (y/n)");
                            userResponse = scanner.nextLine();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        hiLow();
    }
}
