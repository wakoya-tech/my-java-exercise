public class books {
    private String title;
    private String author;

    public books() {
        this.title = "unknown title";
        this.author = "unknown author";
    }

    public books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public books(books another) {
        this.author = another.author;
        this.title = another.title;
    }

    public void displayBookinfo() {
        System.out.println("Title  " + title + " auther " + author);
    }

    public static void main(String[] args) {
        books book1 = new books();
        books book2 = new books("1984", "wako");
        books book3 = new books(book2);
        book1.displayBookinfo();
        book2.displayBookinfo();
        book3.displayBookinfo();
    }
}
