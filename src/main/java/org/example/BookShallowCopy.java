package org.example;
import java.util.*;

public class BookShallowCopy extends Book{

    BookShallowCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public BookShallowCopy clone() throws CloneNotSupportedException {
        return (BookShallowCopy) super.clone(); // Shallow copy
    }
}

