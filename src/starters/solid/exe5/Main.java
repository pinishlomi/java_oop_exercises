package starters.solid.exe5;

interface Animal {
    void speak();
}
class Dog implements Animal {
    public void speak() {
        System.out.println("Woof!");
    }
}
class Cat implements Animal {
    public void speak() {
        System.out.println("Meow!");
    }
}

class ZooKeeper {
    private final Dog dog;
    private final Cat cat;

    public ZooKeeper() {
        this.dog = new Dog();
        this.cat = new Cat();
    }

    public void wakeUpAnimals() {
        dog.speak();
        cat.speak();
    }
}
public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.wakeUpAnimals();
    }
}