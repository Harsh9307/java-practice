class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(String title) {
        System.out.println("hi");
        this(title, "p4", 4);
    }

    Book(String title, String author) {
        this("t5", "a5", 100);
    }

    void displayDetails() {
        System.out.println("Title =>" + this.title);
        System.out.println("Author =>" + this.author);
        System.out.println("Price =>" + this.price);
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Book book1 = new Book("t1", "a1", 1);
        book1.displayDetails();

        Book book2 = new Book("t2", "a2", 2);
        book2.displayDetails();

        Book book3 = new Book("t3", "a3", 3);
        book3.displayDetails();

        Book book4 = new Book("t4");
        book4.displayDetails();

        Book book5 = new Book("t5","a5");
        book5.displayDetails();
    }

}