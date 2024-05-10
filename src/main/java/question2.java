abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void accelerate();

    public void printDetailsAndAcceleration() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.print("Acceleration behavior: ");
        accelerate();
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void accelerate() {
        System.out.println("The car accelerates smoothly.");
    }
}

class Bike extends Vehicle {
    public Bike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void accelerate() {
        System.out.println("The bike accelerates quickly.");
    }
}

public class question2 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2022);
        Vehicle bike = new Bike("Honda", "CBR600RR", 2021);

        System.out.println("Details of Car:");
        car.printDetailsAndAcceleration();

        System.out.println("\nDetails of Bike:");
        bike.printDetailsAndAcceleration();
    }
}
