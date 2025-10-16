public class InnerClassDemo {

    // non static
    class NonStaticInner {
        void display() {
            System.out.println("Inside Non-static Inner Class");
        }
    }

    // 🔹 2. Static
    static class StaticNested {
        void display() {
            System.out.println("Inside Static Nested Class");
        }
    }

    void outerMethod() {
        int localVar = 50;

        // 🔹 3. Local I
        class LocalInner {
            void display() {
                System.out.println(" Inner Class, localVar = " + localVar);
            }
        }

        LocalInner local = new LocalInner();
        local.display();
    }

    public static void main(String[] args) {
        // 🔸 Using Non-static Inner Class
        InnerClassDemo outer = new InnerClassDemo();
        InnerClassDemo.NonStaticInner nonStatic = outer.new NonStaticInner();
        nonStatic.display();

        // 🔸 Using Static Nested Class
        StaticNested staticNested = new StaticNested();
        staticNested.display();

        // 🔸 Using Local Inner Class
        outer.outerMethod();

        // 🔹 4. Anonymous
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Anonymous Inner Class");
            }
        };
        anonymous.run();
    }
}
