public class Person {

    private String name;

    public Person(String name) {
        setName(name);
    }

    // returns the person's name
    public void getName() {
        System.out.println(this.name);
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("My name is %s", name);
    }


    public static void main(String[] args) {
        Person person1 = new Person("Miguel");
        person1.getName();
        person1.sayHello();
    }
}
