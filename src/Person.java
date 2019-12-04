public class Person {

    private String name;

    public Person(String name) {
        setName(name);
    }

    // returns the person's name
    public String getName() {
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("My name is %s%n", name);
    }


    public static void main(String[] args) {
        Person person = new Person("Miguel");
        System.out.println(person.getName());
        person.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4);

//        TODO: ASK ABOUT
        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());
    }
}
