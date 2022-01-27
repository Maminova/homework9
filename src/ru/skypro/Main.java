package ru.skypro;

import ru.skypro.java.course1.lesson9.Book;
import ru.skypro.java.course1.lesson9.Author;

public class Main {



    public static void main(String[] args) {
        // write your code here
        Author authorName = new Author ("John ", "Tolkien");
    Book book1 = new Book ( "The Lord Of The Rings",authorName, 1955 );
        Author authorName2 = new Author ("Николай", "Носов");
    Book book = new Book ("Незнайка на Луне", authorName2, 1965);


        System.out.println("Название книги: " + book1.getTitleOfTheBook());
        System.out.println("Год публикации: " + book1.getYearOfPublication());
        System.out.println("Автор: " + book1.getAuthor().getSurname() + " " + book1.getAuthor().getName());
        book1.setYearOfPublication(2018);
        System.out.println("Год переиздание: " + book1.getYearOfPublication());
        System.out.println("Название книги: " + book.getTitleOfTheBook());
        System.out.println("Автор: " + book.getAuthor().getSurname() + " " + book.getAuthor().getName());
        System.out.println("Год публикации: " + book.getYearOfPublication());
        book.setYearOfPublication(2014);
        System.out.println("Год переиздание: " + book.getYearOfPublication());

        Book theLordOfTheRings2 = new Book ( "The Lord Of The Rings", authorName, 1955 );
        String s = theLordOfTheRings2.toString();
        System.out.println(theLordOfTheRings2);

        Author books  = new Author ("John ", "Tolkien");
        String c = books.toString();
        System.out.println(books);


        Book book2 = new Book ( "The Lord Of The Rings",authorName, 1955 );
        Book book3 = book2;
        System.out.println(book2.equals(book3));

        Book book4 = new Book("The Lord Of The Rings", authorName, 1955 );
        int hCode;
        hCode = book4.hashCode();
        System.out.println(hCode);

        Author authorNameEuq  = new Author ("John ", "Tolkien");
        Author authorNameEuq2 = authorNameEuq;
        System.out.println(authorNameEuq.equals(authorNameEuq2));

        Author authorNameHc  = new Author ("John ", "Tolkien");
        int hCode1;
        hCode1 = authorNameHc .hashCode();
        System.out.println(hCode1);

    }
}
