package com.zzuli.wth.behavior.iterator;

/**
 * @Author: wth
 * @Create: 2023/3/1 - 22:52
 */
public class BookShelf implements Aggrerate{

    private Book[] books;
    private int last;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
