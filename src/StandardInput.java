import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.print("enter number x :");
        int x = scanner.nextInt();
        // System.out.println("the number x is " + x);
        System.out.print("enter number y :");
        int y = scanner.nextInt();
        // System.out.println("the number x is " + y);
        menu: System.out.println("............menu............ ");
        System.out.println("   1 sum");
        System.out.println("   2 pro");
        System.out.println("   3 sub");
        System.out.println("   4 module");
        System.out.print("enter your choice :");
        int choice = scanner.nextInt();
        System.out.println("your choice is  :" + choice);

        switch (choice) {
            case 1:
                System.out.println("  the sum of two numbers is :" + (x + y));
                break;
            case 2:
                System.err.println("the product of two numbers is :" + (x * y));
                break;
            case 3:
                System.err.println("the substaraction of two numbers is :" + (x - y));
                break;
            case 4:
                System.err.println("the module of two numbers is :" + (x % y));
                break;
            default:
                System.out.println("invalid input");
                break;
        }

        scanner.close();
    }
}
