package Encapsulation;

public class Student {

    private String name;
    private String email;
    private int age;

    // setter method to set the data
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAge(int age){
        if (age<0){
            return;
        }
        this.age = age;
    }

    // getter method to return the data
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getAge(){
        return age;
    }

}
