import java.util.Scanner;

public class calculato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(system.in);
        System.out.print("what is your name");
        String name = scanner.nextLine();
        System.out.println("my name is" + name);
        System.out.print("enter number x");
        int x = scanner.nextInt();
        System.out.print("enter number y");
        int y = scanner.nextInt();
        System.out.print("enter your choice");
        int choice = scanner.nextInt();
        System.out.println("my choice is" + choice);
        Scanner.close();
        switch (choice) {
            case 1:
                System.err.println("the sum of two nubers is" + (x + y));

                break;
            case 2:
                System.err.println("the product of two nubers is" + (x * y));

                break;
            case 3:
                System.err.println("the substaraction of two nubers is" + (x - y));

                break;
            case 4:
                System.err.println("the module of two nubers is" + (x % y));

                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
