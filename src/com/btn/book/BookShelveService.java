package com.btn.book;

import java.util.ArrayList;

public class BookShelveService {

    public static void add(BookShelve availableBooks, Book newBook) {
        if (availableBooks.getAvailableBooks().size() < availableBooks.getMaxNumberOfBooks()) {
            availableBooks.getAvailableBooks().add(newBook);
        } else {
            System.out.println("Your bookshelf is full!");
        }
    }

    public static void remove(BookShelve bookshelf, Book Book) {
            if (bookshelf.getAvailableBooks().size() > 0 && bookshelf.getAvailableBooks().contains(Book)) {
                bookshelf.getAvailableBooks().remove(Book);
            } else {
                System.out.println("Your book does not exist!");
            }
        }
    }

