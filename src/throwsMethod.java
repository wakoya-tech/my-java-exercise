import java.io.IOException;

public class throwsMethod {
    void display() throws IOException {
        throw new IOException("device error");// checked exception
    }

    void Yes() throws IOException {
        display();
    }

    void print() {
        try {
            Yes();
        } catch (Exception ex) {
            System.out.println("Exception handled by using throws keyword");
        }
    }

    public static void main(String args[]) {
        throwsMethod th = new throwsMethod();
        th.print();
        System.out.println("normal flow of your program.");
    }
}
