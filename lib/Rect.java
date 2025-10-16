import java.util.Scanner;

public class Rect {
    public double width;
    public double height;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public void displayarea() {
        double area = width * height;
        System.out.println("width " + width + " height " + "area " + area);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Rect e = new Rect(0, 0);
        // Rect a = new Rect(10, 20);
        // Rect b = new Rect(17, 2);
        System.out.println("please enter width ");
        double width = input.nextDouble();
        System.out.println("please enter height ");
        double height = input.nextDouble();
        Rect rect = new Rect(width, height);
        rect.displayarea();
        input.close();

    }
}
