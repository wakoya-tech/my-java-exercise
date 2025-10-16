public class Animale {
    String name;

    public Animale(String name) {
        this.name = name;
    }

    public void Makesound() {
        System.out.println("animal sound");
    }
}

class Dog extends Animale {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void Makesound() {
        System.out.println("dog sound");
    }

    public void fetch() {
        System.out.println(name + "is fetching the info");
    }

    public static void main(String[] args) {
        Animale genericAnimale = new Animale("super anima;");
        genericAnimale.Makesound();
        Dog dog = new Dog("BII");
        dog.Makesound();
        dog.fetch();
    }
}
