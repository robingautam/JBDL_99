package Runtime;

public class Child extends Parent{

    // method hiding , not overriding
    public static void someMethod(){
        System.out.println("child class method: someMethod()");
    }
}
