package ru.skypro.java.course1.lesson9;

public class Author {
    private final String name;
    private String surname;

    public Author ( String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {

        return this.surname;
    }


}
