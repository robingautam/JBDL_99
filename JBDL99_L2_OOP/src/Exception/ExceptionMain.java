package Exception;

import java.sql.SQLDataException;

public class ExceptionMain {

    public static void main(String[] args) throws Exception{
//        System.out.println("start of the program");
//        int a = 10;
//        int result = a/0; // program ended at this line only
//        // when java encounter this line, it will create the object and it will throw the object,
//        // catch mechanism of java will catch this object
//
//        System.out.println("Result: "+result);
//        System.out.println("program ended");


//        System.out.println("start of the program");
//        try {
//            int a = 10/0; // arithemeticexception object will be created, and thrown
//            Object object = null; //
//            System.out.println(object.hashCode()); // NullPointerException // exception line
//        }
//        catch(Exception e){
//            //System.out.println("Object has caught, custom catch behaviour");
//            e.printStackTrace();
//        }
//
//
//        System.out.println("end of the program");


//        try {
//            System.out.println("inside the try block");
//            int a = 10/0;
//        }
//        catch (ArithmeticException e){
//            System.out.println("Arithmetic ");
//        }
//        catch (NullPointerException e){
//            System.out.println("Nullpinter");
//        }
//        catch (Exception e){
//            System.out.println("catch block");
//        }
//        finally {
//            System.out.println("inside the finally block");
//        }
//
//        System.out.println(getData());


        // custom throw, default catch

        try {
            System.out.println("start of the program");
            int a = 10;
            int b = 0;

            if (b == 0) {
                throw new ArithmeticException("This is not possible, / by zero");
            }
            int c = a / b;
        }
        catch (ArithmeticException e){
            System.out.println("exception is thrown");
        }

        System.out.println("end of the program");


//        try {
//            getData();
//        }
//        catch (Exception e){
//
//        }

       // getData();

      //  int a = 10/0;

        int age = 17;
        if (age<18){
            throw new AgeNotValidException("Age is not valid");
        }


    }


    public static int getData() throws Exception{
        try {
            System.out.println("inside the try");
            int s = 10/0;  // exception
            return 1;
        }
        catch (Exception e){
            System.out.println("inside the catch");
            return 2;
        }finally {
            System.exit(0);
            System.out.println("inside the finally");
            return 3;
        }

    }
}
