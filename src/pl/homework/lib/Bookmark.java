package pl.homework.lib;

public class Bookmark {
    String title;
    int page;

    public Bookmark() {
    }

    public Bookmark(String title, int page) {
        this.title = title;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Zakładka w książce: " + title +" na stronie: " + page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bookmark bookmark = (Bookmark) o;

        if (page != bookmark.page) return false;
        return title != null ? title.equals(bookmark.title) : bookmark.title == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + page;
        return result;
    }
}
