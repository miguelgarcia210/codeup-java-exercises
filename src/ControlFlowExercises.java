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
        int num = 2;
        do {
            System.out.print(num + "\n");
            num = (int) Math.pow(num,2);
        } while (num < 1000000);
    }
}
