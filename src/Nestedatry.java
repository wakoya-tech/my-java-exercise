public class Nestedatry {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Going to divide by 0 ");
                int b = 2 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException eie) {
                System.out.println(eie);
            }
            System.out.println("othe statement");

        } catch (Exception exc) {
            System.out.println("system handled succesfull (outer catch)");

        }
        System.out.println("normal flow");

    }
}
