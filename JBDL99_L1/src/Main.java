import model.Student;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
      //  student.name = "Aakash"; private
     //   student.rollNo = 23; private
     //   student.age = 25; default, cannot be accessed outside the package
    //    student.email =  "aakash@gmail.com"; private


       // model.Person student = new model.Student(); // it will not work

      //  model.Person person = new model.Person();


//        System.out.println("Name: "+student.name);
//        System.out.println("Email: "+student.email);
     //   System.out.println("College Name: "+student.collegeName); protected
        // student.canLearn(); private
        student.playGames();


        Demo.display(); // this thing will be decided at the compilation stage only, we have decided display method will be called and its address would be taken
                       // from the metaspace

    }
}
