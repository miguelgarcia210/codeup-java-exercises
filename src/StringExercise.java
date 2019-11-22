public class StringExercise {
    public static void main(String[] args) {
        /*
            We don't need no education
            We don't need no thought control
        */
        String first = "We don't need no education";
        String firstMod = first.replace("education","thought control");
        System.out.println(first);
        System.out.println(firstMod);

        // Check "this" out!, "s inside of "s!
        String second = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(second);

        // In windows, the main drive is usually C:\
        String third = "In windows, the main drive is usually C:\\";
        System.out.println(third);

        // I can do backslashes \, double backslashes \\, and the amazing triple backslash \\\!
        String fourth = "I can do backlashes \\, double backlashes \\\\, and the amazing triple backlash \\\\\\!";
        System.out.println(fourth);
    }
}
