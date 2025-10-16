public class persone {
    protected String name;
    protected int age;

    public persone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayinform() {
        System.out.println("name " + name + "age" + age);
    }
}

class employee extends persone {
    private final String jobtitile;

    public employee(String name, int id, String jobtitle) {
        this.jobtitile = jobtitle;
        super(name, age);
    }

    @Override
    public void displayinform() {
        super.displayinform();
        System.out.println("jobtitle " + jobtitile);
    }

    class student extends persone {
        private final String major;

        public student(String name, int id, String major) {
            this.major = major;
            super(name.age);

        }

        @Override
        public void displayinform(){
            super(name,age);
            System.out.println("major"+major;
        }

        public static void main(String[] args) {
            persone person = new persone("borif", 45);
            person.displayinform();
            System.out.println();
            employee employe = new employee("chala", 012, "se");
            employe.displayinform();
            System.out.println();
            student student = new student("wakjira", 120, "biomedical");
            student.displayinform();
        }

}
