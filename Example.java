class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Driving at " + speed + " km/h");
    }
}

public class Example {
    public static void main(String[] args) {
        Car myCar = new Car(); // object
        myCar.color = "Red";
        myCar.speed = 100;
        myCar.drive(); // Driving at 100 km/h
    }
}
