package org.example;
import java.io.IOException;
import java.util.*;

public class BookDeepCopy extends Book{
    BookDeepCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public BookDeepCopy clone() throws CloneNotSupportedException {
        BookDeepCopy cloned = (BookDeepCopy) super.clone();
        List<String> chaptersCopy = null;
        try {
            chaptersCopy = new ArrayList<>(getChapters());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        cloned.setChapters(chaptersCopy);
        return cloned;
    }
}
