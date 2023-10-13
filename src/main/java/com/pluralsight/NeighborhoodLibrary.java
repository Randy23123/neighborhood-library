package com.pluralsight;

import javax.lang.model.element.NestingKind;
import java.util.Arrays;
import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        String[] books = {"To Kill a Mockingbird", "1984", "Pride and Prejudice", "The Great Gatsby", "The Catcher in the Rye",
                "Moby-Dick", "War and Peace", "The Lord of the Rings", "The Hobbit", "The Hunger Games", "Brave New World",
                "The Hitchhiker's Guide to the Galaxy", "Crime and Punishment", "Harry Potter and the Sorcerer's Stone",
                "The Shining", "The Chronicles of Narnia", "Frankenstein", "Jane Eyre", "The Grapes of Wrath", "The Alchemist"};

        Book[] bookArray = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            bookArray[i] = new Book(i, "isbn" + i, books[i], false, "");
        }

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Show available books");
            System.out.println("2. Show checked out books");
            System.out.println("3. Check out a book");
            System.out.println("4. Check in a book");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available books:");
                    for (Book book : bookArray) {
                        if (!book.isCheckedOut()) {
                            System.out.println(book.getTitle());
                        }
                    }
                    break;

                case 2:
                    System.out.println("Checked out books:");
                    for (Book book : bookArray) {
                        if (book.isCheckedOut()) {
                            System.out.println(book.getTitle());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the title of the book you want to check out: ");
                    String titleName = scanner.next();

                    for (Book book : bookArray) {
                        if (book.getTitle().toLowerCase().equals(titleName)) {
                            book.setCheckedOut(true);
                            System.out.println("You've checked out: " + book.getTitle());
                            break;
                        }
                    }
                    break;

                case 4:
                    for (Book book : bookArray) {
                        if (book.isCheckedOut()) {
                            System.out.println("What book do you want to check in?: ");
                            String checkingIn = scanner.next();
                            if (checkingIn.equals(book.getTitle())){
                                book.checkIn();
                                System.out.println("Your book is checked in!");
                            }
                        }
                    }
                    break;
                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

    }
}
