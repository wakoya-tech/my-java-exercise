public class enter {

    public static void main(String[] args) {
        /*
         * // Example 1: Check if a number is positive, negative, or zero
         * int number = -10;
         * 
         * if (number > 0) {
         * System.out.println("The number is positive.");
         * } else if (number < 0) {
         * System.out.println("The number is negative.");
         * } else {
         * System.out.println("The number is zero.");
         * }
         */
        int mark = 85;
        char grade;
        if (mark >= 85) {
            grade = 'A';
        } else if (mark >= 70) {
            grade = 'B';
        } else if (mark >= 60) {
            grade = 'c';
        } else {
            grade = 'D';
        }
        {
            System.out.println("the grade is " + grade);
        }
    }
}