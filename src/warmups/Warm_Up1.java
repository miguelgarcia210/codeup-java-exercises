package warmups;

public class Warm_Up1 {

    public static String FirstReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String test1 = "Hello World!";
        System.out.println(FirstReverse(test1));
    }
}
