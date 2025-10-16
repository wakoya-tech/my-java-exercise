public class rectangle {
    private double length;
    private double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double parameter() {
        return 2 * (length + width);
    }

    public void displayInfo() {
        System.out.println("length " + length + " width " + width);
        System.out.println(" area " + area() + " parameter " + parameter());
    }

    public static void main(String[] args) {
        rectangle rect1 = new rectangle(4.5, 7.7);
        rectangle rect2 = new rectangle(3.5, 5.6);
        rect1.displayInfo();
        rect2.displayInfo();
    }

}
