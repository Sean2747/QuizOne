package org.example;
import java.io.IOException;
import java.util.*;

public class Book implements Cloneable {
    private String title;
    private String author;
    private List<String> chapters;

    Book(String title, String author, List<String> chapters) {
        setAuthor(author);
        setTitle(title);
        setChapters(chapters);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getChapters() throws IOException {
        return chapters;
    }
    public void setChapters(List<String> chapters) {
        this.chapters = chapters;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    @Override
    public String toString(){
        return "title='" + title + ", author='" + author + ", chapters=" + chapters;
    }

}
