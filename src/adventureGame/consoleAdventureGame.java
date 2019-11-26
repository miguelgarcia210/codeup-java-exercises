package adventureGame;

import java.util.Scanner;
import java.util.ArrayList;

public class consoleAdventureGame {
    private static Scanner scanner = new Scanner(System.in);

    public static String continueGame(String response) {
        switch (response.toLowerCase()) {
            case "y":
            case "yes":
                return "continue";
            case "n":
            case "no":
                return "exit";
            default:
                return "not";
        }
    }

    public static int startGame() {
        System.out.printf(
                "                                  |>>>                                 %n" +
                        "                                  |                               %n" +
                        "                    |>>>      _  _|_  _         |>>>              %n" +
                        "                    |        |;| |;| |;|        |%n" +
                        "                _  _|_  _    \\\\.    .  /    _  _|_  _%n" +
                        "               |;|_|;|_|;|    \\\\:. ,  /    |;|_|;|_|;|%n" +
                        "               \\\\..      /    ||;   . |    \\\\.    .  /%n" +
                        "                \\\\.  ,  /     ||:  .  |     \\\\:  .  /%n" +
                        "                 ||:   |_   _ ||_ . _ | _   _||:   |%n" +
                        "                 ||:  .|||_|;|_|;|_|;|_|;|_|;||:.  |%n" +
                        "                 ||:   ||.    .     .      . ||:  .|%n" +
                        "                 ||: . || .     . .   .  ,   ||:   |       \\,/%n" +
                        "                 ||:   ||:  ,  _______   .   ||: , |            /`\\%n" +
                        "                 ||:   || .   /+++++++\\    . ||:   |%n" +
                        "                 ||:   ||.    |+++++++| .    ||: . |%n" +
                        "              __ ||: . ||: ,  |+++++++|.  . _||_   |%n" +
                        "     ____--`~    '--~~__|.    |+++++__|----~    ~`---,              ___%n" +
                        "-~--~                   ~---__|,--~'                  ~~----_____-~'   `~----~~%n" +
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n" +
                        "| Welcome traveler!             |%n" +
                        "| A new quest is upon us.       |%n" +
                        "| Are you up for the challenge? |%n" +
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n"
        );
        String userResponse = scanner.nextLine();

        boolean progress = false;
        boolean exit = false;
        while (!exit) {
            if (continueGame(userResponse).equals("continue")) {
                System.out.printf(
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n" +
                                "| Splendid!                     |%n" +
                                "| The villagers will be honored |%n" +
                                "| to be under your care.        |%n" +
                                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n"
                );
                exit = true;
                progress = true;
            } else if (continueGame(userResponse).equals("exit")) {
                System.out.printf(
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n" +
                                "| Discouraged!                  |%n" +
                                "| Carry on then...              |%n" +
                                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n"
                );
                exit = true;
            } else {
                System.out.printf(
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n" +
                                "| Apologies traveler,          |%n" +
                                "| Accept challenge? (y/n)      |%n" +
                                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n"
                );
                userResponse = scanner.nextLine();
            }
        }

        if (progress) {
            return 1;
        } else {
            return 0;
        }
    }

    // ~~~~~~~~~~ GAME METHODS ~~~~~~~~~~
    public static Player playerCreation() {
        Player player = new Player();
        player.setName(travelerName()); // Set return from travelerName() to player name field
        player.setDifficulty(chooseDifficulty()); // Set return from chooseDifficulty() to player difficulty field
        player.setStats(playerStatsSet(player)); // Set stats for player based upon chosen difficulty
        System.out.println(player.stats);
        return player;
    }

    // ========================== PLAYER STATS INITIALIZATION ==========================
    // Determines which stats method to run based on player difficulty
    public static ArrayList<Integer> playerStatsSet(Player player) {
        if (player.difficulty.equals("villager")) {
            return villagerStats(player);
        }
        return null;
    }

    /*
     Asks user for input for individual stats.
     returns all individual stat values in a container to be used in playerStatsSet
     */
    public static ArrayList<Integer> villagerStats(Player player) {
        ArrayList<Integer> stats = new ArrayList<>();

        System.out.printf(
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n" +
                        "| Set player stats:%n"
        );

        for (String name : player.statNames) {
            System.out.printf("| %s: ", name);
            stats.add(statWhile(name));
        }
        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n");

        return stats;
    }

    // Determines if user stat input is valid
    public static int statWhile(String name) {
        int field = scanner.nextInt();

        boolean exit = false;
        while (!exit) {
            if (field < 1 || field > 100) {
                System.out.printf(
                        "| Stat must be between 1-100 inclusively!%n" +
                                "| %s: ", name
                );
                field = scanner.nextInt();
            } else {
                exit = true;
            }
        }
        return field;
    }
    // =================================================================================


    public static void endGame() {
        System.out.println("Game has ended");
    }

    // ~~~~~~~~~~ STORY LINE ~~~~~~~~~~
    public static String travelerName() {
        System.out.printf(
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n" +
                        "| What is your name traveler?   |%n" +
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n"
        );
        String userName = scanner.nextLine();

        boolean validName = false;
        while (!validName) {
            if (userName.equals("")) {
                System.out.printf(
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n" +
                                "| Surely you must have a name.  |%n" +
                                "| Enter your name below so we   |%n" +
                                "| may honor your spirit.        |%n" +
                                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n"
                );
                userName = scanner.nextLine();
            } else {
                validName = true;
                System.out.printf(
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n" +
                                "| You're the great %s%n" +
                                "| It is an honor to be in your  |%n" +
                                "| presence.                     |%n" +
                                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n", userName
                );
            }
        }
        return userName;
    }

    public static String chooseDifficulty() {
        String difficultyPrompt = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n" +
                "| Select difficulty:            |%n" +
                "| Villager (v)                  |%n" +
                "|   - manually set stats        |%n" +
                "| Warrior (w)                   |%n" +
                "|   - automated stats           |%n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n";

        String difficultyChosenPrompt = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n" +
                "| Excellent!                    |%n" +
                "| Let's get a move on then!     |%n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n";

        System.out.printf(difficultyPrompt);

        String selectedDifficulty = scanner.nextLine();

        boolean exit = false;
        while (!exit) {
            switch (selectedDifficulty.toLowerCase()) {
                case "v":
                case "villager":
                    exit = true;
                    System.out.printf(difficultyChosenPrompt);
                    selectedDifficulty = "villager";
                    break;
                case "w":
                case "warrior":
                    exit = true;
                    System.out.printf(difficultyChosenPrompt);
                    selectedDifficulty = "warrior";
                    break;
                default:
                    System.out.printf(difficultyPrompt);
                    selectedDifficulty = scanner.nextLine();
            }
        }
        return selectedDifficulty;
    }

    public static void main(String[] args) {
        if (startGame() == 1) {
            playerCreation();
        } else {
            endGame();
        }
    }
}
