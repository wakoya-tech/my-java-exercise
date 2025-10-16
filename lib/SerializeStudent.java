
import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + gpa);
    }
}

public class SerializeStudent {
    public static void main(String[] args) {
        Student student = new Student("Borif", 101, 3.85);

        // Serialize the student object to a file
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\Administrator\\Desktop\\file.txt"))) {
            out.writeObject(student);
            System.out.println("Student object serialized to file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the student object from the file
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("C:\\Users\\Administrator\\Desktop\\file.txt"))) {
            Student deserializedStudent = (Student) in.readObject();
            System.out.println("\nDeserialized Student object:");
            deserializedStudent.displayInfo(); // Corrected method call
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
