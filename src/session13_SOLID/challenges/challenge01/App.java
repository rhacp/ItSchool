package session13_SOLID.challenges.challenge01;

import session13_SOLID.challenges.challenge01.models.*;
import session13_SOLID.challenges.challenge01.services.Library;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Library library = new Library();
        Member memberOne = new Member("Andrei", "Bucuresti", "Phone number 1");
        library.addMember(memberOne);
        Member memberTwo = new Member("Marcian", "Suceava", "Phone number 2");
        library.addMember(memberTwo);
        Member memberThree = new Member("Bogdan", "Cluj", "Phone number 3");
        library.addMember(memberThree);
        System.out.println("");

        Author authorOne = new Author("Eminescu", "Romania", LocalDate.parse("1867-11-16"));
        library.addAuthor(authorOne);
        Author authorTwo = new Author("Orwell", "US", LocalDate.parse("1901-11-18"));
        library.addAuthor(authorTwo);
        Author authorThree = new Author("J. K. Rowling", "English", LocalDate.parse("1998-11-20"));
        library.addAuthor(authorThree);
        System.out.println("");

        Book bookOne = new Book("A tale", authorOne, "X", 5);
        library.addBook(bookOne);
        Book bookTwo = new Book("Ferma Animalelor", authorTwo, "X", 3);
        library.addBook(bookTwo);
        Book bookThree = new Book("Harry Potter", authorThree, "X", 2);
        library.addBook(bookThree);
        Book bookFour = new Book("1984", authorTwo, "X", 1);
        library.addBook(bookFour);
        System.out.println("");

        library.showAllBooks();
        System.out.println("");

        library.showAllAuthors();
        System.out.println("");

        library.showAllMembers();
        System.out.println("");

        String testAuthor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author to search published books for: ");
        testAuthor = scanner.nextLine();
        library.findBookByAuthor(testAuthor);
        System.out.println("");

        library.removeMember(memberThree);
        library.showAllMembers();
        System.out.println("");

        library.borrowBook(bookFour, memberOne, library);
        library.borrowBook(bookFour, memberOne, library);
        library.borrowBook(bookThree, memberOne, library);
        library.borrowBook(bookTwo, memberOne, library);
        library.borrowBook(bookOne, memberTwo, library);
        library.borrowBook(bookTwo, memberThree, library);
        System.out.println("");

        memberOne.showAllBorrowedBooks();
    }
}
