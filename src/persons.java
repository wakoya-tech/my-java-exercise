
package person;

public class Person {

    // Fields
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    // Additional field
    private final String jobTitle;

    // Constructor
    public Employee(String name, int age, String jobTitle) {
        super(name, age); // Call the constructor of the superclass
        this.jobTitle = jobTitle;
    }

    // Overriding method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Job Title: " + jobTitle);
    }
}

class Student extends Person {
    // Additional field
    private final String major;

    // Constructor
    public Student(String name, int age, String major) {
        super(name, age); // Call the constructor of the superclass
        this.major = major;
    }

    // Overriding method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Major: " + major);
    }

    public static void main(String[] args) {
        Person person = new Person("Borif", 45);
        person.displayInfo();

        System.out.println();

        Employee employee = new Employee("Chala", 30, "Software Engineer");
        employee.displayInfo();

        System.out.println();

        Student student = new Student("Yeshi", 20, "Computer Science");
        student.displayInfo();
    }
}
