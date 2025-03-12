package com.learn.service.impl;

import com.learn.dao.BookDao;
import com.learn.dao.impl.BookDaoImpl;
import com.learn.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public BookServiceImpl(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("BookServiceImpl save...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BookServiceImpl destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
       System.out.println("BookServiceImpl init...");
    }
}
