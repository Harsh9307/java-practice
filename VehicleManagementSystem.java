interface Vehicle {
    void start();
    void stop();
    void accelerate();

}
abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
}
class PetrolEngine extends Engine {
    void startEngine() {
        System.out.println("Petrol engine started with vroom!");
    }

    void stopEngine() {
        System.out.println("Petrol engine stopped.");
    }
}

class ElectricEngine extends Engine {
    void startEngine() {
        System.out.println("Electric engine started silently...");
    }

    void stopEngine() {
        System.out.println("Electric engine shut down.");
    }
}

class Car implements Vehicle{
    private Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.startEngine();
    }
    public void stop(){
        engine.stopEngine();
    }
    public void accelerate(){
        System.out.println("Car is accelerating...");
    }
}


public class VehicleManagementSystem {
    public static void main(String[] args) {
        Vehicle tesla = new Car(new PetrolEngine());
        tesla.start();
        tesla.accelerate();
        tesla.stop();
    }
}
