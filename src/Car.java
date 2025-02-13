package src;

public class Car {
    // Attributes
    public String make;
    public String model;
    private int year;

    // CONSTRUCTOR
    public Car(String carMake, String carModel, int carYear) {
        make = carMake;
        model = carModel;
        year = carYear;
    }
    public Car() {

    }

    public static void main(String[] args) {
        Car car = new Car();
        Car carEthan = new Car("Hyundai", "VeraCruz", 2011);
        Car carAlex = new Car("Ford", "CrownVictoria", 1998);
        System.out.println("What is car.toString()? " + car.toString());
        System.out.println("What is carEthan.toString()? " + carEthan.toString());
        System.out.println("What is carAlex.toString()? " + carAlex.toString());

    }
    public String toString() {
        return "\nMake: " + this.make + "\nModel: " + this.model + "\nYear: " + this.year;
    }
}
