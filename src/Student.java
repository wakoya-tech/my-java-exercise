public class Student {
    // Fields
    String name;
    int age;

    // Constructor
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Instance Block
    {
        System.out.println("An object is being created.");
    }

    // Static Block
    static {
        System.out.println("Class Student is loaded.");
    }

    // Nested Class
    class Address {
        String city = "Lagos";

        void printCity() {
            System.out.println("City: " + city);
        }
    }
}
