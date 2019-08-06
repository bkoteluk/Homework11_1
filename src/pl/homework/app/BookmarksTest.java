package pl.homework.app;

import pl.homework.lib.Bookmark;

import java.util.Locale;
import java.util.Scanner;



public class BookmarksTest {

    public static void readBookmark(Scanner scanner, Bookmark bookmark) {
        System.out.print(" >> Tytuł książki: ");
        bookmark.setTitle(scanner.nextLine());
        System.out.print(" zakładka na stronie nr: ");
        bookmark.setPage(scanner.nextInt());
        scanner.nextLine();
    }


    public static void main(String[] args) {

        Bookmark[] bookmarks = new Bookmark[3];
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        for (int i = 0; i < bookmarks.length; i++) {
            bookmarks[i] = new Bookmark();
            readBookmark(scanner, bookmarks[i]);
            for (int j = 0; j < i; j++) {
                if (bookmarks[i].equals(bookmarks[j])) {
                   i--;
                   System.out.println("Zakładka w książce \"" + bookmarks[i].getTitle() + "\" już istnieje !!!");
                }
            }
        }
        scanner.close();
    }
}
