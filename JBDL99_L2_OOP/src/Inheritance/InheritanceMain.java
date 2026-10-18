package Inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BMW";
        car.price = 5000000;

        SportsCar sportsCar = new SportsCar();

        System.out.println(sportsCar.price);
    }
}
