public class Demo {


    /**
     * Sir, could you please explain the context of below para. Demo is class, display() is static method
     *
     * When Demo.display() is called, the JVM performs Static Binding (or early binding) at compile time.
     * It resolves the method address using the class type pointer in the Metaspace rather than looking
     * up an object reference on the Heap
     * **/
    public Demo(){
        System.out.println("inside constructor");
    }


    public static void display(){

    }

}
