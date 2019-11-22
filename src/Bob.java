import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        System.out.println("Hi, I'm Bob!");
        System.out.println("Wanna chat? (y/n)");

        boolean exit = false;
        boolean chat = false;
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            String userResponse = scanner.next();

            switch (userResponse.toLowerCase()) {
                case "y":
                case "yes":
                    System.out.println("Loading...Done");
                    chat = true;
                    exit = true;
                    break;
                case "n":
                case "no":
                    System.out.println("Bye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Value entered not 'y' or 'n'.");
                    System.out.println("Continue? (y/n)");
            }
        }

        if (chat) {
            boolean exit2 = false;
            while (!exit2) {
//            Starting message
                System.out.println("What's on your mind?");
//            Clear
                String userResponse = scanner.nextLine();
//            Get user entered line
                userResponse = scanner.nextLine();
//            print out line
//                System.out.println(userResponse);

                int length = userResponse.length();
                int last;
                char lastChar;
//            if nothing was entered
                if (length == 0) {
                    lastChar = ' ';
                } else {
                    last = length - 1;
                    lastChar = userResponse.charAt(last);
                }
//            char lastChar = userResponse.charAt(last);

                switch (lastChar) {
                    case '?':
                        System.out.println("Sure");
                        break;
                    case '!':
                        System.out.println("Whoa, chill out!");
                        break;
                    case ' ':
                        System.out.println("Fine. Be that way!");
                        break;
                    default:
                        System.out.println("Whatever.");
                }

                System.out.println("Would you like to continue? (y/n)");
                userResponse = scanner.next();

                switch (userResponse.toLowerCase()) {
                    case "y":
                    case "yes":
                        break;
                    case "n":
                    case "no":
                        System.out.println("Bye!");
                        exit2 = true;
                        break;
                    default:
                        System.out.println("Value entered not 'y' or 'n'.");
                        System.out.println("Continue? (y/n)");
                }
            }
        }
    }
}
