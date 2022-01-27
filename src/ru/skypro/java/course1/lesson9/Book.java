package ru.skypro.java.course1.lesson9;

public class Book {
    private final String titleOfTheBook;
    private final Author author;
    private int yearOfPublication;

    public Book(String titleOfTheBook, Author author, int yearOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }


    public String getTitleOfTheBook() {
        return this.titleOfTheBook;

    }

    public Author getAuthor() {

        return this.author;
    }

    public int getYearOfPublication() {

        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }


}
