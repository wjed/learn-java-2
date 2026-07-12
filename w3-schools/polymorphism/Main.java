public class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound!");
    }
}

// Write a class for a specific animal

class Bird extends Animal {
    public void animalSound() {
        System.out.println("Birds say ca ca");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Bird myBird = new Bird();
        myBird.animalSound();
    }
}