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

        System.out.println("Enter a sentence.");
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        System.out.println("Enter the dimensions of a classroom at Codeup. (l,w,h)");
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();

        System.out.printf("Length: %.2f\nWidth: %.2f\nHeight: %.2f\n", length, width, height);
        System.out.printf("Area: %.2f\n", (length * width));
        System.out.printf("Perimeter: %.2f\n", ((length * 2) + (width * 2)));
        System.out.printf("Volume: %.2f\n", (length * width * height));
    }
}
