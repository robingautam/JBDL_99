package constructor;

public class Person {

    String name;
    String email;
    int age;
    public static String collegeName;

    public Person(){

    }

    public Person(String name){
       this.name = name;
       // this(name,"robin@gmail.com",23);
    }

    // Constructor overloading
    public Person(String name, String email, int age){ // constructor, no-args constructor
        this("Robin"); // when we call any constructor, it should be first line
        this.name = name;
        this.email = email;
        this.age = age;
    }



    public String toString(){
        return "Name: "+this.name + ", Email: "+this.email + ", Age: "+this.age;

    }

}
