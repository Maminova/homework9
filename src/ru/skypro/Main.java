package ru.skypro;

import ru.skypro.java.course1.lesson9.Book;
import ru.skypro.java.course1.lesson9.Author;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Author authorName = new Author ("John ", "Tolkien");
    Book theLordOfTheRings = new Book ( "TheLordOfTheRings",authorName, 1955 );
        Author authorName2 = new Author ("Николай", "Носов");
    Book book = new Book ("Незнайка на Луне", authorName2, 1965);


        System.out.println("Название книги: " + theLordOfTheRings.getTitleOfTheBook());
        System.out.println("Год публикации: " + theLordOfTheRings.getYearOfPublication());
        System.out.println("Автор: " + theLordOfTheRings.getAuthor().getSurname() + " " + theLordOfTheRings.getAuthor().getName());
        theLordOfTheRings.setYearOfPublication(2018);
        System.out.println("Год переиздание: " + theLordOfTheRings.getYearOfPublication());
        System.out.println("Название книги: " + book.getTitleOfTheBook());
        System.out.println("Автор: " + book.getAuthor().getSurname() + " " + book.getAuthor().getName());
        System.out.println("Год публикации: " + book.getYearOfPublication());
        book.setYearOfPublication(2014);
        System.out.println("Год переиздание: " + book.getYearOfPublication());




    }
}
