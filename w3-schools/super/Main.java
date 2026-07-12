class Animal {
    public void animalSound() {
        System.out.println("Animals make sounds.");
    }
}

class Dog extends Animal {
    public void animalSound() {
        super.animalSound();
        System.out.println("Dogs bark");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
    }
}