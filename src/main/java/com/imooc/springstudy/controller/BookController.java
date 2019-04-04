package com.imooc.springstudy.controller;

import com.imooc.springstudy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhangyq
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

}
