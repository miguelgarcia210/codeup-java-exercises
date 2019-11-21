import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s\n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer.");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.println("Enter 3 words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("%s\n%s\n%s\n", word1, word2, word3);
    }
}
