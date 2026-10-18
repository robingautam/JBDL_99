package Polymorphism;

public class Person {

    public void behave(){
        System.out.println("person is behaving normal");
    }


    public void behave(boolean happy){
        if (happy){
            System.out.println("Person is happy");
        }else {
            System.out.println("person is not happy");
        }
    }
}
