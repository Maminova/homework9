package ru.skypro;

import ru.skypro.java.course1.lesson9.Book;
import ru.skypro.java.course1.lesson9.Author;

public class Main {

    public static void main(String[] args) {
        // write your code here
    Book theLordOfTheRings = new Book ( "theLordOfTheRings", " John Tolkien", 1955 );
    Author authorName = new Author ("John ", "Tolkien");
        System.out.println("Название книги: " + theLordOfTheRings.getTitleOfTheBook());
        System.out.println("Автор: " + theLordOfTheRings.getAuthor());
        System.out.println("Год публикации: " + theLordOfTheRings.getYearOfPublication());
        theLordOfTheRings.setYearOfPublication(2018);
        System.out.println("Год переиздание: " + theLordOfTheRings.getYearOfPublication());




    }
}
