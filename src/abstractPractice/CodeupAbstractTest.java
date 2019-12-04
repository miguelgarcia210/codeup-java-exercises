package abstractPractice;

public class CodeupAbstractTest {
    public static void main(String[] args) {
        String[] student1 = {"Miguel", "Garcia","Deimos","Macbook Pro"};
        CodeupStudent miguel = new CodeupStudent(student1,true);

        miguel.greeting();
        miguel.study();
        System.out.println(miguel.giveBusinessCards());
    }
}
