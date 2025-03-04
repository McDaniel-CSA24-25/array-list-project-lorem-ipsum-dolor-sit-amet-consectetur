public class Book {
    String title;
    String author;
    boolean isAvailable;
    int checksOut;
    public Book() {
        title = "Untitled manuscript";
        author = "Unknown author";
        isAvailable = true;
        checksOut = 0;
    }
    public Book(String t, String a) {
        title = t;
        author = a;
        isAvailable = true;
        checksOut = 0;
    }
    public Book(String t, String a, int c) {
        title = t;
        author = a;
        isAvailable = true;
        checksOut = c;
    }
    public Book(String t, String a, boolean i, int c) {
        title = t;
        author = a;
        isAvailable = i;
        checksOut = c;
    }
}
