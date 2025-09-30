// Superclass
class Vehicle {
    String brand = "Generic Vehicle";

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass Car
class Car extends Vehicle {
    int wheels = 4;

    void display() {
        System.out.println("Brand: " + brand + ", Wheels: " + wheels);
    }
}

// Subclass Bike
class Bike extends Vehicle {
    int wheels = 2;

    void display() {
        System.out.println("Brand: " + brand + ", Wheels: " + wheels);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c = new Car();    
        c.start();        
        c.display();

        Bike b = new Bike();
        b.start();
        b.display();
    }
}
