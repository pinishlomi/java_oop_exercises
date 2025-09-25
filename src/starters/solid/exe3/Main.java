package starters.solid.exe3;

class Bird {
    public void fly() {
        System.out.println("I am flying!");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }
}

class Eagle extends Bird {
}


public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.fly();
        Bird penguin = new Penguin();
        penguin.fly(); // This will throw an UnsupportedOperationException
    }
}

