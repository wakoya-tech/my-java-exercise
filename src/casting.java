public class casting {
    public static void main(String[] args) {
        int intvar = 23;
        double doublevar = intvar;
        System.out.println("int to doublevar " + doublevar);
        doublevar = 100.12;
        intvar = (int) doublevar;
        System.out.println("double to intvar  " + intvar);
        byte bytevar = (byte) intvar;
        System.out.println("int to byte  " + bytevar);
        char charvar = (char) intvar;
        System.out.println("int to char  " + charvar);
        long longvar = (long) doublevar;
        System.out.println("double to var  " + longvar);
    }
}
