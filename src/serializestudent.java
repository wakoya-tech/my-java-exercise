import java.io.FileOutputStream;

public class serializestudent {
    public static void main(String[] args) {
        Student student = new Student("borif", 101, 1001);
        try {
            objectouputstream out = new objectouputstream(new FileOutputStream("student.ser"));
            out.writeobject(student);
            System.out.println("student object seriized");

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
