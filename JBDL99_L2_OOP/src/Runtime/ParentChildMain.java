package Runtime;

public class ParentChildMain {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.someMethod();


        Parent child = new Child();
        child.someMethod();

        Child.someMethod();



    }
}
