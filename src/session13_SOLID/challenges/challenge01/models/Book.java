package session13_SOLID.challenges.challenge01.models;

import java.util.Random;

public class Book {

    private String title;
    private Author author;
    private String publisher;
    /***
     * The International Standard Book Number (ISBN) is a 13-digit number that uniquely identifies books and book-like products
     * published internationally.
     */
    private long ISBN;
    private int copies;
    private Random random = new Random();

    public Book(String title, Author author, String publisher, int copies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = 1000000000000L + random.nextLong(999999999999L);
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public long getISBN() {
        return ISBN;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void addCopies(int copiesNumber) {
        copies += copiesNumber;
    }

    public String returnBookInformation() {
        String bookInformation = "Title: " + title + ", " + "Author: " + author.getName() + ", " + "Publisher: " + publisher + ", " + "ISBN: " + ISBN + ", " + "Copies: " + copies;
        return bookInformation;
    }

    public boolean checkBookAvailability() {
        if (copies > 0) {
            return true;
        } else return false;
    }
}
