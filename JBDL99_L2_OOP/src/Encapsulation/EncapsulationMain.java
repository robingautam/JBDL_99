package Encapsulation;

public class EncapsulationMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Robin");
        student.setEmail("robin@gmail.com");
        student.setAge(-20);

        System.out.println(student.getName());
        System.out.println(student.getEmail());
        System.out.println(student.getAge());

    }
}
