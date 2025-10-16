import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(system.in);
        System.out.println("enter binary number");
        String binarynumber = scanner.nextLine();
        if (isvalidbinary(binarynumber)) {
            int decimalnmber = binarytodecimal(binarynumber);
            System.out.println("the decimal equivalentof binary " + binarynumber + "is" + decimalnmber + ".");

        } else {
            System.out.println("invalid binary number please enter a number only 0s and 1s");
        }
        Scanner.close();
    }

    public static boolean isvalidbinary(String binary) {
        for (char c : binary.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}
