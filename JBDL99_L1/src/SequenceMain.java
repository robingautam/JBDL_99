public class SequenceMain {

    static int  a = 10;
    int b = 20;
   // init block


    // static initialization block

    public static void main(String[] args) {
        System.out.println("inside the main method");
        Demo demo = new Demo();
        System.out.println(a);


         {
            System.out.println("Initialization block");
        }

    }
    static {
        System.out.println("static initialization block");
    }
}
