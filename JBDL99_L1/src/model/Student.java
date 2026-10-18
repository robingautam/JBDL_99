package model;

public class Student {

    // properties or state or global variables
    private int rollNo;
    private String name;
    private String email;
     int age;
    protected String collegeName;


    // behaviour or method
    private void canLearn(){
        System.out.println("model.Student is learning");
    }

    public void playGames(){
        System.out.println("model.Student is playing");
    }

}
