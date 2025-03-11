package com.learn.service.impl;

import com.learn.dao.BookDao;
import com.learn.dao.impl.BookDaoImpl;
import com.learn.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();

    public void save() {
        System.out.println("BookServiceImpl save...");
        bookDao.save();
    }
}
