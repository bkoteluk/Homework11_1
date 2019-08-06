package pl.homework.app;

import pl.homework.lib.Bookmark;

import java.util.Locale;
import java.util.Scanner;

import static pl.homework.lib.BookmarkTools.isTagged;
import static pl.homework.lib.BookmarkTools.readBookmark;


public class BookmarksTest {

    public static void main(String[] args) {
        Bookmark[] bookmarks = new Bookmark[3];
        Bookmark tag;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int i = 0;
        do {
            tag = readBookmark(scanner);
            if (!isTagged(bookmarks, tag , i)) {
                bookmarks[i] = tag;
                i++;
            } else {
                System.out.println("Zakładka w książce \"" + tag.getTitle() + "\" już istnieje !!!");
            }
        } while (i < bookmarks.length);

        scanner.close();
    }
}
