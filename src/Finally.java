public class Finally {

    public static void main(String[] args) {
        try {
            int data = 25 / 5;
            System.out.println(data);
        } catch (NullPointerException eno) {
            System.out.println(eno);
        } finally {
            System.out.println("this is finally blook that always executed ");
        }
        System.out.println("rest of code ");
    }
}
