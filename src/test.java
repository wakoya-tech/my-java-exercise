public class Test {
    double salary[] = { 2000, 4000, 3000, 7000, 1000, 1500 };

public void displayArray()Throws ArrayIndexOutOfBoundsException{
    for(int i=0;i<10;i++)
    System.err.println(salary[i]);
}

    public static void main(String args[]) {
        try {
            Test dv = new Test();
            dv.displayArray();
        } catch (Exception xx) {
            System.out.println("error" + xx.toString());

        }
    }
}
