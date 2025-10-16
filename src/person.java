interface Shape {
    double area();

    double perimeter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Shape myCircle = new Circle(5.0);
        Shape myRectangle = new Rectangle(4.0, 6.0);
        System.out.println("Circle area: " + myCircle.area());
        System.out.println("Circle perimeter: " + myCircle.perimeter());
        System.out.println("Rectangle area: " + myRectangle.area());
        System.out.println("Rectangle perimeter: " + myRectangle.perimeter());
    }
}
