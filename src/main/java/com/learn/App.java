package com.learn;

import com.learn.config.SpringConfig;
import com.learn.service.AccountService;
import com.learn.service.BaiduService;
import com.learn.service.BookService;
import com.learn.service.UsersService;
import com.learn.service.impl.UsersServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

@Configuration
//@MapperScan(basePackages = {"com.learn."})
public class App {
    public static void main( String[] args ) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookService bookService = (BookService) ctx.getBean("bookService");
//        bookService.save();
//        System.out.println(bookService);
//        DataSource dataSource = ctx.getBean(DataSource.class);
//        System.out.println(dataSource);
//        UsersService usersService = (UsersService) ctx.getBean("usersService");
//        System.out.println(usersService.findAll());
//        usersService.test(100);
//        BaiduService baiduService = (BaiduService) ctx.getBean("BaiduService");
//        System.out.println(baiduService.login("123", "root     "));
        AccountService accountService = (AccountService) ctx.getBean("AccountService");
        accountService.transfer("盘蠢驴", "屌丝哥", 100);
    }
}
