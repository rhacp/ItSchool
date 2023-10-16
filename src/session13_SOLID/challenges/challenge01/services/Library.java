package session13_SOLID.challenges.challenge01.services;

import session13_SOLID.challenges.challenge01.models.Author;
import session13_SOLID.challenges.challenge01.models.Book;
import session13_SOLID.challenges.challenge01.models.Member;

import java.util.ArrayList;

public class Library {

    private ArrayList<Author> authorList = new ArrayList<>();
    private ArrayList<Book> bookList = new ArrayList<>();
    private ArrayList<Member> memberList = new ArrayList<>();

    /***
     * Will add the books to the ArrayList alphabetically by title.
     */
    public void addBook(Book book) {
        if (bookList.size() == 0) {
            bookList.add(book);
            System.out.println("Book \"" + book.getTitle() + "\" created!");
        } else {
            int helpCounter = 0;
            for (Book element : bookList) {
                if (element.getTitle().equals(book.getTitle())) {
                    System.out.println("This book already exists. Please try again or change its number of copies.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = bookList.size() - 1; index >= 0; index--) {
                    if ((bookList.get(index).getTitle()).compareToIgnoreCase(book.getTitle()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                bookList.add(secondHelp, book);
                System.out.println("Book \"" + book.getTitle() + "\" created!");
            }
        }
    }

    /***
     * Will add the authors to the ArrayList alphabetically by name.
     */
    public void addAuthor(Author author) {
        if (authorList.size() == 0) {
            authorList.add(author);
            System.out.println("Author " + author.getName() + " created!");
        } else {
            int helpCounter = 0;
            for (Author element : authorList) {
                if (element.getName().equals(author.getName())) {
                    System.out.println("This author already exists. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = authorList.size() - 1; index >= 0; index--) {
                    if ((authorList.get(index).getName()).compareToIgnoreCase(author.getName()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                authorList.add(secondHelp, author);
                System.out.println("Author " + author.getName() + " created!");
            }
        }
    }

    /***
     * Will add the members to the ArrayList alphabetically by name.
     */
    public void addMember(Member member) {
        if (memberList.size() == 0) {
            memberList.add(member);
            System.out.println("Member " + member.getName() + " created!");
        } else {
            int helpCounter = 0;
            for (Member element : memberList) {
                if (element.getName().equals(member.getName())) {
                    System.out.println("This member already exists. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = memberList.size() - 1; index >= 0; index--) {
                    if ((memberList.get(index).getName()).compareToIgnoreCase(member.getName()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                memberList.add(secondHelp, member);
                System.out.println("Member " + member.getName() + " created!");
            }
        }
    }

    public void removeBook (Book book) {
        bookList.remove(book);
        System.out.println("The book \"" + book.getTitle() + "\" was removed.");
    }

    public void removeAuthor (Author author) {
        authorList.remove(author);
        System.out.println("The author " + author.getName() + " was removed.");
    }

    public void removeMember (Member member) {
        memberList.remove(member);
        System.out.println("The member " + member.getName() + " was removed.");
    }

    public void showAllBooks() {
        System.out.println("All books:");
        for (Book book : bookList) {
            System.out.println(book.returnBookInformation());
        }
    }

    public void showAllAuthors() {
        System.out.println("All authors:");
        for (Author author : authorList) {
            System.out.println(author.returnAuthorInformation());
        }
    }

    public void showAllMembers() {
        System.out.println("All members:");
        for (Member member : memberList) {
            System.out.println(member.returnMemberInformation());
        }
    }

    public void findBookByAuthor(String name) {
        System.out.println("All books by the " + name + " author are:");
        for(Book element : bookList) {
            if (element.getAuthor().getName().equals(name)) {
                System.out.println(element.returnBookInformation());
            }
        }
    }

    public void findBookByTitle(String title) {
        System.out.println("All books with the \"" + title + "\" title are:");
        for(Book element : bookList) {
            if (element.getTitle().equals(title)) {
                System.out.println(element.returnBookInformation());
            }
        }
    }

    public void findBookByISBN(long ISBN) {
        System.out.println("All books with the \"" + ISBN + "\" ISBN are:");
        for(Book element : bookList) {
            if (element.getISBN() == ISBN) {
                System.out.println(element.returnBookInformation());
            }
        }
    }

    /***
     * This method should be in the Library class, not in the Member class,
     * so we can check if the user still exists in our database (userList variable).
     */
    public void borrowBook(Book book, Member member, Library library) {
        if (memberList.contains(member)) {
            if (book.getCopies() > 0) {
                member.addBorrowedBook(book);
                book.addCopies(-1);
                System.out.println(" by " + member.getName() + ".");
            } else {
                System.out.println("There are no copies left of this book to borrow.");
            }
        } else {
            System.out.println("The member is no longer our client.");
        }
    }
}
