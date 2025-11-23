import java.util.ArrayList;
import java.util.List;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Lion implements Animal {
    public void makeSound() {
        System.out.println("Lion roars");
    }
}

class Peacock implements Animal {
    public void makeSound() {
        System.out.println("Pecock mayursss");
    }
}

class Zoo {
    List<Animal> animals = new ArrayList<>();

    public void startShow() {
        for (Animal a : animals) {
            a.makeSound();
        }
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }
}

public class Ass {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Lion());
        zoo.addAnimal(new Dog());
        zoo.addAnimal(new Peacock());

        zoo.startShow();
    }

}
