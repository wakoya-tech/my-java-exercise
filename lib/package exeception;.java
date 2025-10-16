package exeception;

public class exceptions {
    public static void main(String[] args) {
        try {
            int b[] = { 20, 30, 40 };
            System.out.println(b[6]);
            int a = 20 / 0;
            System.out.println(a);
        } catch (ArithmeticException a) {
            System.out.println(a.toString());
        } catch (ArrayIndexOutOfBoundsException aeo) {
            System.out.println(aeo.toString());
        } finally {
            System.out.println("this always executed");
        }
    }

}