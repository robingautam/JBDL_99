package Runtime;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.react();

        Father father = new Father();
        father.react();
        father.anotherMethod();

        Person mother = new Mother();
        mother.react();

        Person friend = new Friend();
        friend.react();
    }
}
