import java.io.Serializable;
import java.io.*;

public class Animal {
    private String name;
    private int id;
    private double gpa;

    public Animal(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    public void dispalyinfo() {
        System.out.println(" student name " + name + "id " + id + "gpa" + gpa);
    }
    public static void main(String[] args) 
    {
        Animal student = new Animal(wakoya, ru1046, 3.6);
        Animal stu = new Animal(marara, ru1000, 3.7);
        student.dispalyinfo();
        stu.dispalyinfo();
    }

}
