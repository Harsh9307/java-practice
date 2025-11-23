// Runtime Polymorphism: Use previous Vehicle example, create an array of Vehicle objects, assign Car and Bike, call move() in a loop. Observe runtime behavior.

import java.util.ArrayList;
import java.util.List;

class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    void move() {

    }
}

class Car extends Vehicle {
    Car(int speed) {
        super(speed);
    }

    void move() {
        System.out.println("Car is moving at " + this.speed + "km/hr");
    }
}

class Bike extends Vehicle {
    Bike(int speed) {
        super(speed);
    }

    void move() {
        System.out.println("Bike is moving at " + this.speed + "km/hr");
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Vehicle car1 = new Car(80);
        car1.move();

        Vehicle car2 = new Bike(120);
        car2.move();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(120));
        vehicles.add(new Bike(80));

        for (Vehicle v : vehicles) {
            v.move();
        }
    }

}
