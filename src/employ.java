public class employ {
    String name = " yohanis dasaleny";
    String id = "1234";
    float salary = 4000;

}

class programmer extends employ {
    int bonus = 1000;

    public static void main(String[] args) {
        programmer p = new programmer();
        System.out.println("programmer name is" + p.name);
        System.out.println("programmer ID number is" + p.id);
        System.out.println("programmeer salary is" + p.salary);
        System.out.println(" bonus of programmer is" + p.bonus);
    }
}
