package com.learn;

import com.learn.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // 获取ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取bean实例
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
