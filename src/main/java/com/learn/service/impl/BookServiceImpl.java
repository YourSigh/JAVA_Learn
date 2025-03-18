package com.learn.service.impl;

import com.learn.dao.BookDao;
import com.learn.dao.impl.BookDaoImpl;
import com.learn.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Value("${jdbc.username}")
    private String name;

//    public BookServiceImpl(BookDaoImpl bookDao) {
//        this.bookDao = bookDao;
//    }

    public void save() {
        System.out.println("BookServiceImpl save..." + name);
        bookDao.save();
    }

//    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

//    @Override
//    public void destroy() throws Exception {
//        System.out.println("BookServiceImpl destroy...");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//       System.out.println("BookServiceImpl init...");
//    }
}
