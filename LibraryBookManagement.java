import java.util.ArrayList;
import java.util.Scanner;
public class LibraryBookManagement {
    public static void main (String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        books.add(new Book("My Life", "Jason Milliner", true, 15));
        books.add(new Book());
        books.add(new Book("Much Ado About Nothing", "William Shakespeare", false, 416));
        books.add(new Book("Dragonsong", "Anne McCaffrey", true, 30));
        books.add(new Book("Dragonsinger", "Anne McCaffrey", true, 26));
        books.add(new Book("Dragondrums", "Anne McCaffrey", false, 17));
        books.add(new Book("Bioshifter Volume 1", "Natalie Maher", false, 5));
        books.add(new Book("Bioshifter Volume 2", "Natalie Maher", true, 4));
        books.add(new Book("Everytime", "Rick Astley"));
        books.add(new Book("Codex Atlanticus", "Leonardo da Vinci", false, 46));
        books.add(new Book("Journey to the South", "Yu Xiangdou", true, 3));
        books.add(new Book("Wielka, większa i największa", "Jerzy Broszkiewicz", false, 12));
        books.add(new Book("Much Ado About Nothing", "William Shakespeare", true, 12));
        books.add(new Book("The Hobbit, or There and Back Again", "John Ronald Reuel Tolkien", true, 310));
        books.add(new Book("The Eye of the World", "Robert Jordan", true, 43));
        printStacks(books);
        while (true) {
            System.out.println("\nWould you like to check out a book? (y/n)");
            if (keyboard.nextLine().matches("[yY]")) {
                System.out.println("Which index do you want to check out?");
                while (true) {
                    int targetIndex = keyboard.nextInt();
                    int counter = 0;
                    int target = -1;
                    for (int i=0;i<books.size();i++) {
                        if (books.get(i).isAvailable) {
                            if (++counter==targetIndex) {
                                target=i;
                            }
                        }
                    }
                    if (target==-1) {
                        if (counter!=0) {
                            System.out.println("There is not an available book at that index. Please try again.");
                        } else {
                            System.out.println("There are no books available at this time. Please come back later.");
                            break;
                        }
                    } else {
                        books.get(target).isAvailable=false;
                        books.get(target).checksOut+=1;
                        keyboard.nextLine();
                        break;
                    }
                }
                printStacks(books);
            } else {
                System.out.println("Goodbye.");
                break;
            }
        }
    }
    public static void printStacks(ArrayList<Book> b) {
        System.out.println("\nAvailable books:");
        int counter = 0;
        for (Book i : b) {
            if (i.isAvailable) {
                System.out.println(++counter + ": " + i.title + " by " + i.author + " | checked out " + i.checksOut + " times.");

            }
        }
        System.out.println("\nUnavailable Books");
        for (Book i : b) {
            if (!i.isAvailable) {
                System.out.println(++counter + ": " + i.title + " by " + i.author + " | checked out " + i.checksOut + " times.");
            }
        }
    }
}