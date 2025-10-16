// Superclass
class Animal {
    // Field
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void makeSound() {
        System.out.println(" Animal sound");
    }
}

// Subclass
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Call the constructor of the superclass
    }

    // Overriding method
    @Override
    public void makeSound() {
        System.out.println("Dog Sound");
    }

    // Additional method
    public void fetch() {
        System.out.println(name + " is fetching the Info");
    }

    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Super Animal");
        genericAnimal.makeSound();

        Dog dog = new Dog("BII");
        dog.makeSound();
        dog.fetch();
    }
}