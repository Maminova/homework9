package ru.skypro.java.course1.lesson9;

import java.util.Objects;

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

    public String toString() {
        return "Название книги: " + this.titleOfTheBook + " Автор: " + this.author + " Год публикации: " + this.yearOfPublication;

    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(titleOfTheBook, book.titleOfTheBook) && Objects.equals(author, book.author);
    }


    public int hashCode() {
        return Objects.hash(titleOfTheBook, author, yearOfPublication);
    }

//    //    public boolean equals(Object other) {
//        public boolean equals(Object obj) {
//            if (obj == this) {
//                return true;
//            }
//            if (obj == null || obj.getClass() != this.getClass()) {
//                return false;
//            }
//            Book books = (Book) obj;
//            return titleOfTheBook == books.titleOfTheBook
//                    && (author == books.author || (author != null && author.equals(books.getAuthor())))
//                    && (yearOfPublication == books.yearOfPublication
//                    || (yearOfPublication != null && yearOfPublication.equals(books.getYearOfPublication())));
//        }

//        if (this.getClass() != other.getClass()) {
//            return false;
//        }
//        Book book = (Book) other;
//        return i.equals(book3.id);
    }
