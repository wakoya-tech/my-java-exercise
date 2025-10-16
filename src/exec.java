public class exec {
public static void main(String[] args) {
    try {
        System.out.println("going to divide i");
  int b=39/0;

    } catch (ArithmeticException e) {
        System.out.println(e);
    }
    try {
        int a[]=new int[5];
        a[5]=4;
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
    }
    System.out.println("othe are statement");
}

catch(Exception ex)
{
    
    System.out.println("handeled");}
    System.out.println("normal flow");
}}
