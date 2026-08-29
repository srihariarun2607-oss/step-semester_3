class LibraryBook {
    String title;
    String isbn;

    LibraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    LibraryBook(String title) {
        this(title, "PENDING");
    }

    void display() {
        System.out.println(title + " | " + isbn + " | Catalogued: true");
    }
}

public class Main {
    public static void main(String[] args) {

        String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
        String[] isbns = {"978-0132350884", "", "9780451524935", ""};

        for (int i = 0; i < titles.length; i++) {

            if (isbns[i].equals("")) {
                LibraryBook b = new LibraryBook(titles[i]);
                b.display();
            } else {
                LibraryBook b = new LibraryBook(titles[i], isbns[i]);
                b.display();
            }
        }
    }
}