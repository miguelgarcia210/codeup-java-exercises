import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newArr = Arrays.copyOf(people, people.length + 1);
        newArr[newArr.length - 1] = person;
        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers)); // Necessary to return a string representation of the array

        Person[] people = new Person[3];

        people[0] = new Person("Miguel");
        people[1] = new Person("Jena");
        people[2] = new Person("Mizu");

        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println(people.length);

        Person[] myArr = ArraysExercises.addPerson(people, new Person("Teddy"));

        for (Person person : myArr) {
            System.out.println(person.getName());
        }
        System.out.println(myArr.length);
    }
}
