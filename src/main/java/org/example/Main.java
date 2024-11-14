package org.example;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException {
        BookShallowCopy original = new BookShallowCopy("1984", "George Orwell", new ArrayList<>(List.of("Chapter 1", "Chapter 2")));
        BookShallowCopy clone = original.clone();
        original.getChapters().add("Chapter 3");
        System.out.println(original.getChapters());
        System.out.println(clone.getChapters());
    }
}