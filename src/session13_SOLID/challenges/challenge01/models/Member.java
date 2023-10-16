package session13_SOLID.challenges.challenge01.models;

import java.util.ArrayList;

public class Member {

    private String name;
    private String address;
    private String contactInformation;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Member(String name, String address, String contactInformation) {
        this.name = name;
        this.address = address;
        this.contactInformation = contactInformation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public void addBorrowedBook(Book book) {
        if (borrowedBooks.size() == 0) {
            borrowedBooks.add(book);
            System.out.print("Book \"" + book.getTitle() + "\" was borrowed");
        } else {
            int helpCounter = 0;
            for (Book element : borrowedBooks) {
                if (element.getTitle().equals(book.getTitle())) {
                    System.out.println("This book is already in the person borrowed books list. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = borrowedBooks.size() - 1; index >= 0; index--) {
                    if ((borrowedBooks.get(index).getTitle()).compareToIgnoreCase(book.getTitle()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                borrowedBooks.add(secondHelp, book);
                System.out.print("Book \"" + book.getTitle() + "\" borrowed");
            }
        }
    }

    public int numberOfBorrowedBooks() {
        return borrowedBooks.size();
    }

    public void giveBookBack(Book book) {
        borrowedBooks.remove(book);
    }

    public String returnMemberInformation() {
        String authorInformation = "Name: " + name + ", " + "Address: " + address + ", " + "Contact Information: " + contactInformation;
        return authorInformation;
    }

    public void showAllBorrowedBooks() {
        System.out.println("All books borrowed by " + name + ":");
        for (Book book : borrowedBooks) {
            System.out.println(book.returnBookInformation());
        }
    }
}
