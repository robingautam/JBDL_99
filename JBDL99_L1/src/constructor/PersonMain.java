package constructor;

public class PersonMain  {

    public static void main(String[] args) {
        printName();
        Person person = new Person("Robin","robin@gmail.com",25); // object created

//        System.out.println(person.name);
//        System.out.println(person.email);
//        System.out.println(person.age);
      Person.collegeName = "MAIT";

        System.out.println(person);

        System.out.println(person.hashCode()); // address of the object


        Person person2 = new Person();
        //System.out.println(Person.collegeName);

    }

    public static void printName(){
        System.out.println("name is printing");
    }
}
