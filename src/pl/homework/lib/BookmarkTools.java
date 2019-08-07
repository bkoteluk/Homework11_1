package pl.homework.lib;

import java.util.Scanner;

public class BookmarkTools {


    public static Bookmark readBookmark(Scanner scanner) {
        Bookmark bookmark = new Bookmark();

        System.out.print(" >> Tytuł książki: ");
        bookmark.setTitle(scanner.nextLine());
        System.out.print(" zakładka na stronie nr: ");
        bookmark.setPage(scanner.nextInt());
        scanner.nextLine();
        return bookmark;
    }

    public static boolean isTagged(Bookmark[] bookmarks, Bookmark tag, int index) {
        boolean isTag = false;
        for (int i = index; i >= 0; i--) {
            if (tag.equals(bookmarks[i])) {
                return true;
            } else
                isTag = false;
        }
        return isTag;
    }
}
