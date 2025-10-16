public class stringmanupaltion {
    public static void main(String[] args) {
        String greeting = "wakoya, ";
        String name = "daba ";
        String message = greeting + name;
        System.out.println("message   :" + message);
        System.out.println("length    :" + message.length());
        System.out.println("substring :" + message.substring(7));
        System.out.println("replace   :" + message.replace("world", "java"));
    }
}
