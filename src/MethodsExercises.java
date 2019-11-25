import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static float addition(float a, float b) {
        return a + b;
    }

    public static float subtraction(float a, float b) {
        return a - b;
    }

    public static float multiplication(float a, float b) {
        return a * b;
    }

    //    TODO: BONUS
    public static float multiply(float a, float b) {
        if (b > 0)
//            System.out.println("This: ");
            return (a + multiply(a, b - 1));
        return 0;
    }

    public static float division(float a, float b) {
        if (b == 0) {
            System.out.println("Divisor can not be 0");
            return 0;
        }
        return a / b;
    }

    public static float modulus(float a, float b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        System.out.println("Enter your age.");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();

        if (userAge < min || userAge > max) {
            getInteger(min, max);
        } else {
            System.out.printf("I remember when I was %s\n", userAge);
        }
        return 1;
    }

    public static void factorial() {
        System.out.println("Enter an integer from 1 to 20 inclusively.");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput < 1 || userInput > 20) {
            factorial();
        } else {
            long answer = 1;
            for (int i = 1; i <= userInput; i++) {
                answer = answer * i;
            }
            System.out.printf("The result of %s! is %s%n", userInput, answer);

            System.out.println("Would you like to continue? (y/n)");
            String userResponse = scanner.next();

            boolean exit = false;
            while (!exit) {
                switch (userResponse.toLowerCase()) {
                    case "y":
                    case "yes":
                        exit = true;
                        factorial();
                        break;
                    case "n":
                    case "no":
                        exit = true;
                        break;
                    default:
                        System.out.println("Continue? (y/n)");
                        userResponse = scanner.next();
                }
            }
        }
    }

    public static int randomNumber(int number) {
        return (int) (Math.random() * (number - 1 + 1)) + 1;
    }

    public static void displayDie(int number) {
        System.out.println("     _________");
        System.out.printf("   /    %s    /|\n", number);
        System.out.println(" /_________/  |");
        System.out.printf("|          | %s|\n", number);
        System.out.printf("|    %s     |  /\n", number);
        System.out.println("|__________|/");
    }

    public static void diceRoll() {
        System.out.println("How many sides on the pair of dice?");
        Scanner scanner = new Scanner(System.in);
        int sides = scanner.nextInt();

        if (sides > 9) {
            System.out.println("# of sides cannot be greater than 9.");
            diceRoll();
        } else if (sides < 1) {
            System.out.println("# of sides must be at least 1.");
            diceRoll();
        } else {
            System.out.println("Roll the dice");
            int die1 = randomNumber(sides);
            displayDie(die1);
            int die2 = randomNumber(sides);
            displayDie(die2);
        }
    }

    public static void main(String[] args) {
        System.out.println(addition(1, 4)); // 5
        System.out.println(subtraction(5, 1)); // 4
        System.out.println(multiplication(1, 4)); // 4
        System.out.println(division(15, 5)); // 3
        System.out.println(division(15, 0)); // 3
        System.out.println(modulus(16, 5)); // 1
        System.out.println(multiply(5, 3)); // 15
        getInteger(5, 10);
        factorial();
        diceRoll();
    }
}
