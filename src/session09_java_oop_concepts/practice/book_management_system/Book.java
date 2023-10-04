package session09_java_oop_concepts.practice.book_management_system;

public class Book {

    public String title;
    public Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return author.getName();
    }
}
