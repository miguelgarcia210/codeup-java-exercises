package animals;

public class Dog extends Animal {
    public Dog(boolean isAlive, int age, int numberOfLegs, String food, String habitat) {
        this.isAlive = isAlive;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.food = food;
        this.habitat = habitat;
    }

    public String sound() {
        return "Woof Woof";
    }

    public String movement() {
        return "Run, Swim, Wag, Tail";
    }

    public static void main(String[] args) {
        Dog bean = new Dog(true,4,4,"dog food","couch");
        System.out.println(bean.sound());
        System.out.println(bean.movement());
    }
}
