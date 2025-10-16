public class buuk {
    private String titile;
    private String author;

    public buuk() {
        this.author = "unkoun author";
        this.titile = "unkoun titile";
    }

    public buuk(String titile, String author) {
        this.titile = titile;
        this.author = author;
    }

    public buuk(buuk another) {
        this.author = another.author;
        this.titile = another.titile;
    }

    public void display() {
        System.out.println(" author name  " + author);
        System.out.println("title book  " + titile);
    }

    public static void main(String[] args) {
        buuk book1 = new buuk();
        buuk book2 = new buuk("john", "sin");
        buuk book3 = new buuk(book1);
        book1.display();
        book2.display();
        book3.display();
    }
}
