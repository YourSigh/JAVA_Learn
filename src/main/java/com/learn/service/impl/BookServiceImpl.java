package com.learn.service.impl;

import com.learn.dao.BookDao;
import com.learn.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save() {
        System.out.println("BookServiceImpl save...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
