package com.learn;

import com.learn.service.BookService;
import com.learn.service.impl.BookServiceImpl;

public class App
{
    public static void main( String[] args )
    {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
