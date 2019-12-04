import java.util.Random;

public class ServerNameGenerator {

    public static String[] arr1 = {
            "aggressive",
            "agreeable",
            "ambitious",
            "brave",
            "calm",
            "delightful",
            "eager",
            "faithful",
            "mysterious",
            "silly"
    };

    public static String[] arr2 = {
            "people",
            "family",
            "world",
            "universe",
            "planets",
            "person",
            "software",
            "temperature",
            "medicine",
            "marriage"
    };

    public static int randomInt(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

    public static String randomElement(String[] array) {
        return array[randomInt(array.length)];
    }

    public static String serverName() {
        return randomElement(arr1) + "-" + randomElement(arr2);
    }

    public static void main(String[] args) {
        System.out.println(serverName());
    }
}
