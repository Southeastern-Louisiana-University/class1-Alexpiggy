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
        System.out.println("What is carEthan.toString()? " + carEthan.toString());

    }
    /*public String toString() {
        return toString() + " new stuff\n";
    }*/

}
