package com.zzuli.wth.behavior.iterator;

/**
 * @Author: wth
 * @Create: 2023/3/1 - 23:09
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
