package warmups;

public class FirstFactorial {

    public static int FirstFactorial(int num) {
        int factorial = 1;
        for (int i = num; i != 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(FirstFactorial(4));
    }
}
