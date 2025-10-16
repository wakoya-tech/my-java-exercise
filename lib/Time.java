public class Time {
    public String monthy;
    public int day;
    public int year;

    public Time(String monthy, int day, int year) {
        this.monthy = monthy;
        this.day = day;
        this.year = year;
    }

    public void display() {
        System.out.println(" Month " + monthy + " Day " + day + " Year " + year);
    }

    public static void main(String[] args) {
        Time n = new Time("may", 2, 2000);
        Time m = new Time("may", 2, 2000);
        n.display();
        m.display();
    }
}
