package com.zzuli.wth.behavior.iterator;

/**
 * @Author: wth
 * @Create: 2023/3/1 - 22:49
 */
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
