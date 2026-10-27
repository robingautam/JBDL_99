package Interface;

/**
 * with the help of interface we can achieve 100% abstraction
 * **/
public interface I1 {

    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
    void method6();
    void method17();
    void method8();
    void method9();
    void method10();
    default void  method11(){
        System.out.println("some default method");
    }

    static void staticMethod(){ // you cannot override this static method
        System.out.println("static method");
    }

    private void privateMethod(){
        System.out.println("iside the private method");
    }
}
