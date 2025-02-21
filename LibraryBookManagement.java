import java.util.ArrayList;
import java.util.Scanner;
public class LibraryBookManagement {
    public static void main (String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("My Life", "Jason Milliner", true, 15));
        books.add(new Book());
        books.add(new Book("Much Ado About Nothing", "William Shakespeare", false, 416));
        books.add(new Book("Dragonsong", "Anne McCaffrey", true, 30));
        books.add(new Book("Dragonsinger", "Anne McCaffrey", true, 26));
        books.add(new Book("Dragondrums", "Anne McCaffrey", false, 17));
        books.add(new Book("Bioshifter Volume 1", "Natalie Maher", false, 5));
        books.add(new Book("Bioshifter Volume 2", "Natalie Maher", true, 4));
        books.add(new Book("Everytime", "Rick Astley"));
        books.add(new Book("Codex Atlanticus", "Leonardo da Vinci", true, 46));
        books.add(new Book("Journey to the South", "Yu Xiangdou", true, 3));
        books.add(new Book("Wielka, większa i największa", "Jerzy Broszkiewicz", true, 12));
        books.add(new Book("Much Ado About Nothing", "William Shakespeare", false, 416));
        books.add(new Book("Much Ado About Nothing", "William Shakespeare", false, 416));
        books.add(new Book("Much Ado About Nothing", "William Shakespeare", false, 416));
    }
}