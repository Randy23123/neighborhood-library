package com.pluralsight;

import java.util.Arrays;

public class Book {
    private String[] bookLlist;
    private long id;
    private String isbn;
    private String title;
    private  boolean isCheckedOut;
    private String checkedOutTo;
public Book(String[]bookNames){
    this.bookLlist = bookNames;
}

    public Book(long id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    //getters
    public long getId() {
        return this.id;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public String getTitle() {
        return this.title;
    }
    public boolean isCheckedOut() {
        return this.isCheckedOut;
    }
    public String getCheckedOutTo() {
        return this.checkedOutTo;
    }

    //setters

    public void setId(long id) {
        this.id = id;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }
    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    //methods
    public void checkOut(String checkOut){
        this.checkedOutTo = checkOut;
        this.isCheckedOut = true;
    }
    public void checkIn(){
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                '}';
    }
}
