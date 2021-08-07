package com.joldo.designpattern.singleton.case1.before;

import com.joldo.designpattern.singleton.case1.before.model.Book;

public class BeforeMain {

    public static void main(String[] args){

        Book book1 = new Book(Book.Category.Thriller);
        System.out.println( book1 );

        Book book2 = new Book(Book.Category.Humor);
        System.out.println( book2 );

        Book book3 = new Book(Book.Category.Horror);
        System.out.println( book3 );

    }

}
