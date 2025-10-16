
public interface shapee {
    double area();

    double parimeter();
}

class circle implements shapee {
    double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;

    }

    @Override
    public double parimeter() {
        return 2 * Math.PI * radius;
    }

    class rectangle implements shapee {
            double width, length;
    
            public rectangle(double width, double length) {
                this.length = length;
                this.width = width;
            }
    
            @Override
            public double area() {
                return length * width;
            }
    
            @Override
            public double parimeter() {
                return 2 * (length + width);
            }
    
            public static void main(String[] args) {
                shapee mycircle = new circle(5.0);
                shapee myrectange = new rectangle(6.0, 7.0);
                System.out.println("circle area" + mycircle.area());
                System.err.println("circle parimetre" + mycircle.parimeter());
                System.out.println("rectangle area" + myrectange.area());
                System.err.println("circle parimetre" + myrectange.parimeter());
            }
    }
