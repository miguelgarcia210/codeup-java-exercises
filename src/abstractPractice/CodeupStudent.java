package abstractPractice;

public class CodeupStudent extends Student {
    public CodeupStudent(String[] information, boolean graduated) {
        this.firstName = information[0];
        this.lastName = information[1];
        this.cohort = information[2];
        this.computer = information[3];
        this.graduated = graduated;
    }

    public void greeting(){
        System.out.printf("Hello %s",cohort);
    }

    public void study(){
        System.out.println("Full-Stack Java Curriculum");
    }

    public boolean giveBusinessCards() {
        if (graduated) {
            return true;
        } else {
            return false;
        }
    }
}
