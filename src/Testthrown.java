public class Testthrown {
    public static void validate(int age) {
        if (age < 18) {
            System.out.println("person is not elligable to vote");
        } else {
            System.out.println("peson is elligable to vote");
        }

    }

    public static void main(String[] args) {
        validate(19);
        System.out.println("rest of the code");

    }
}