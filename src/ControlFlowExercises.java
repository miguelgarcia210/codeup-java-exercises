import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        byte i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        // TODO: Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        byte num = 0;
//        do {
//            System.out.print(num + "\n");
//            num += 2;
//        } while (num <= 100);

        // TODO: Alter your loop to count backwards by 5's from 100 to -10.

//        byte num = 100;
//        do {
//            System.out.print(num + "\n");
//            num -= 5;
//        } while (num >= -10);

        // TODO: Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        int num = 2;
//        do {
//            System.out.print(num + "\n");
//            num = (int) Math.pow(num,2);
//        } while (num < 1000000);

        // TODO: Refactor previous exercises into for-loops
//        for (byte i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

//        for (byte i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

//        for (byte i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

        // TODO: FIZZ-BUZZ
//        for (byte i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // TODO: Display of Powers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int userInput = scanner.nextInt();

        System.out.println("Here is your table!");

        System.out.println(" number |  squared  | cubed");
        System.out.println(" ------ |  -------- | -----");


        for (int i = 1; i <= userInput; i++) {
            System.out.printf(" %s\t\t|  %s\t\t| %s\n", i, (long) (i * i), (long) ((i * i) * i));
        }

        System.out.println("Would you like to continue? (y/n)");
        String userResponse = scanner.next();
        switch (userResponse.toLowerCase()) {
            case "y":
            case "yes":
                System.out.println("Let's continue.");
                break;
            case "n":
            case "no":
                System.out.println("Stopping here.");
                break;
            default:
                System.out.println("Value entered not 'y' or 'n'.");
        }
    }
}
